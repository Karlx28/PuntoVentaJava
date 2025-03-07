
package datos.interfaces;

import java.util.List;
/**
 *
 * @author kxrmm
 */
public interface CRUDGeneralInterface <T>{
    public  List<T> getAll(String list);
    public boolean insert( T object );
    public boolean update( T object  );
    public boolean  onVariable(int id);
    public boolean offVaraible(int id);
    public boolean exist(String text);
    public int total();
}
