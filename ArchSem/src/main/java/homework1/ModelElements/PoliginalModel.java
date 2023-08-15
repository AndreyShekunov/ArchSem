package homework1.ModelElements;

import java.util.ArrayList;
import java.util.List;

public class PoliginalModel {
    public List<Texture> textures;
    public List<Poligon> poligonas;

    public PoliginalModel(List<Texture> textures) {
        this.textures = textures;
        poligonas = new ArrayList<>();
    }
}
