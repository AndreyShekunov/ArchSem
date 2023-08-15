package homework1.InMemoryModel;

import homework1.ModelElements.Camera;
import homework1.ModelElements.Flash;
import homework1.ModelElements.PoliginalModel;
import homework1.ModelElements.Scene;

import java.util.ArrayList;
import java.util.List;

public class ModelStore {
    public List<PoliginalModel> models = new ArrayList<>();
    public List<Scene> scenes = new ArrayList<>();
    public List<Flash> flashes = new ArrayList<>();
    public List<Camera> cameras = new ArrayList<>();
    private List<IModelChangeObserver> changeObservers = new ArrayList<>();

    public List<Scene> getScenes() {
        return scenes;
    }
    public void NotifyChange(IModelChanger sender) {}
}
