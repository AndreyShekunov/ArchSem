package homework1.ModelElements;

import java.util.ArrayList;
import java.util.List;

public class PoligonalModel {
    public List<Texture> textures;
    public List<Poligon> poligonas;

    public PoligonalModel(List<Texture> textures) {
        this.textures = textures;
        poligonas = new ArrayList<>();
    }
}
