import java.util.*;

public class Blog {

    private List<Post> posts;

    public Blog(){
        posts = new ArrayList<Post>();
    }

    public void adicionarPostagem(Post post){
        if (!posts.contains(post)){
            posts.add(post);
        } else {
            throw new IllegalArgumentException("Postagem jah existente");
        }
    }

    public Set<Autor> obterTodosAutores(){
        Set<Autor> getTodosAutores = new TreeSet<Autor>();

        for (Post post: this.posts){
            if (!getTodosAutores.contains(post.getAutor())){
                getTodosAutores.add(post.getAutor());
            }
        }

        return getTodosAutores;
    }

    public Map<Categorias, Integer> obterContagemPorCategoria(){
        Map<Categorias, Integer> getContagemCategoria = new TreeMap<Categorias, Integer>();

        for (Post post: posts) {
            if (getContagemCategoria.containsKey(post.getCategoria())){
                getContagemCategoria.put(post.getCategoria(), getContagemCategoria.get(post.getCategoria()) + 1);
            } else {
                getContagemCategoria.put(post.getCategoria(), 1);
            }
        }

        return getContagemCategoria;
    }

    public Set<Post> obterPostsPorAutor(Autor autor){
        Set<Post> postsAutor = new HashSet<Post>();

        for (Post post : this.posts){
            if (post.getAutor().equals(autor)){
                postsAutor.add(post);
            }
        }

        return postsAutor;
    }

    public Set<Post> obterPostsPorCategoria(Categorias categoria){
        List<Post> listaPostsCategoria = new ArrayList<Post>();
        Set<Post> postsCategoria = new TreeSet<Post>();

        for (Post post : this.posts){
            if (post.getCategoria().equals(categoria)){
                listaPostsCategoria.add(post);
            }
        }

        Collections.sort(listaPostsCategoria);
        postsCategoria.addAll(listaPostsCategoria);

        return postsCategoria;
    }

    public Map<Categorias, Set<Post> > obterTodosPostsPorCategorias(){
        List<Categorias> listaCategorias = new ArrayList<Categorias>();
        Set<Post> postCategoria = new TreeSet<Post>();
        Map<Categorias, Set<Post>> listaPostCategorias = new TreeMap<Categorias, Set<Post>>();

        for (Post post: this.posts) {
            if (!listaCategorias.contains(post.getCategoria()))
                listaCategorias.add(post.getCategoria());
        }

        Collections.sort(listaCategorias);

        for (Categorias categoria : listaCategorias){
            for (Post post: this.posts) {
                if (post.getCategoria().equals(categoria)){
                    if (!listaPostCategorias.containsKey(categoria)){
                        postCategoria = new TreeSet<Post>();
                    }

                    postCategoria.add(post);
                    listaPostCategorias.put(categoria, postCategoria);
                }
            }
        }

        return listaPostCategorias;
    }

    public Map<Autor, Set<Post>> obterTodosPostsPorAutor(){
        List<Autor> listaAutores = new ArrayList<Autor>();
        Set<Post> postAutor = new TreeSet<Post>();
        Map<Autor, Set<Post>> listaPostAutores = new TreeMap<Autor, Set<Post> >();

        listaAutores.addAll(obterTodosAutores());
        Collections.sort(listaAutores);

        for (Autor autor : listaAutores){
            for (Post post: this.posts) {
                if (post.getAutor().equals(autor)){
                    if (!listaPostAutores.containsKey(autor)){
                        postAutor = new TreeSet<Post>();
                    }

                    postAutor.add(post);
                    listaPostAutores.put(autor, postAutor);
                }
            }
        }

        Collections.sort(listaAutores);

        return listaPostAutores;
    }


}
