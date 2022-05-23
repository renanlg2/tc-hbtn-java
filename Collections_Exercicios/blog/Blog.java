import java.util.*;

class PostByCategory implements Comparator<Post>{

    @Override
    public int compare(Post post, Post postObj) {
        return post.getCategoria().compareTo(postObj.getCategoria());
    }
}

public class Blog {

    private List<Post> posts;

    public Blog(){
        posts = new ArrayList<Post>();
    }

    public void adicionarPostagem(Post post){
        posts.add(post);
    }

    public Set<String> obterTodosAutores(){
        Set<String> getTodosAutores = new HashSet<String>();

        Collections.sort(posts);

        for (Post post: posts){
            getTodosAutores.add(post.getAutor());
        }

        return getTodosAutores;
    }

    public Map<String, Integer> obterContagemPorCategoria(){
        Map<String, Integer> getContagemCategoria = new HashMap<String, Integer>();

        Collections.sort(posts, new PostByCategory());

        for (Post post: posts) {
            if (getContagemCategoria.containsKey(post.getCategoria())){
                getContagemCategoria.put(post.getCategoria(), getContagemCategoria.get(post.getCategoria()) + 1);
            } else {
                getContagemCategoria.put(post.getCategoria(), 1);
            }
        }

        return getContagemCategoria;
    }
}
