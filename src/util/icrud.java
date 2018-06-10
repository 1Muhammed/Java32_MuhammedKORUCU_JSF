package util;

import java.util.List;

public interface icrud<T> {
    
    public boolean kaydet(T t);
    public boolean duzenle(T t);
    public boolean sil(T t);
    public List<T> listele(T t);
    public List<T> ActiveList(T t);
    public T bul(int id,T t);
    public List<T> ara(String kolonadi,String aranan,T t);
    public List<T> ara(T t);
}
