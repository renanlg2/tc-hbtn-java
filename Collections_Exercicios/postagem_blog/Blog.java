import java.util.*;

class PostsByAutor implements Comparator<Autor>{
    @Override
    public int compare(Autor autor, Autor autorObj) {
        return autor.compareTo(autorObj);
    }
}

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
        Set<Post> postsCategoria = new HashSet<Post>();

        for (Post post : this.posts){

            if (post.getCategoria().equals(categoria)){
                postsCategoria.add(post);
            }
        }

        return postsCategoria;
    }

    public Map<Categorias, Set<Post> > obterTodosPostsPorCategorias(){
        Set<Categorias> listaCategorias = new HashSet<Categorias>();
        Set<Post> listaPosts = new HashSet<Post>();
        Map<Categorias, Set<Post> > listaCategoriaPost = new HashMap<Categorias, Set<Post> >();

        Collections.sort(this.posts);

        for (Post post : this.posts){
            if (!listaCategorias.contains(post.getCategoria()))
                listaCategorias.add(post.getCategoria());
        }

        for (Categorias categoria : listaCategorias){
            for (Post post: this.posts) {
                if (post.getCategoria().equals(categoria)){
                    if (!listaPosts.contains(post)){
                        listaPosts.add(post);
                    }
                }
            }

            listaCategoriaPost.put(categoria, listaPosts);
        }

        return listaCategoriaPost;
    }

    public Map<Autor, Set<Post>> obterTodosPostsPorAutor(){
        Set<Autor> listaAutores = obterTodosAutores();
        Set<Post> listaPosts = new HashSet<Post>();
        Map<Autor, Set<Post>> listaPostAutores = new HashMap<Autor, Set<Post>>();

        for (Autor autor : listaAutores){
            for (Post post : this.posts){
                if (post.getAutor().equals(autor)){
                    if (!listaPosts.contains(post)){
                        listaPosts.add(post);
                    }
                }
            }

            listaPostAutores.put(autor, listaPosts);
        }

        return listaPostAutores;
    }
}
