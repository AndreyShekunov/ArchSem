package homework1.ModelElements;

import java.util.ArrayList;
import java.util.List;

public class Scene {
    public int ID;
    public List<PoligonalModel> Models;
    public List<Flash> Flashes;
    public List<Camera> Cameras = new ArrayList<Camera>();

    // Конструктор
    public Scene(int id, List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) throws Exception {
        this.ID = id;
        if (!models.isEmpty()) {
            this.Models = models;
        } else {
            throw new Exception("Должна быть хотябы одна модель");
        }
        this.Flashes = flashes;
        if (!cameras.isEmpty()) {
            this.Cameras = cameras;
        } else {
            throw new Exception("Должна быть хотябы одна камера");
        }
    }

    public <T> T method1(T flash) {
        return flash;
    }
    public <T, E> T method2(T Model, E Flash) {
        return Model;
    }

//     // заглушка
//     public Type1 method1(Type1 t1) {
//     return t1;
//     }
//
//     // заглушка
//     public Type1 method1(Type1 t1, Type2 t2) {
//     return t1;
//     }


}
