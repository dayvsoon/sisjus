/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sisjus.dao;

import br.com.sisjus.cadastro.advogadojuiz;
import java.util.List;
/**
 *
 * @author miguel
 */
public class advogadoJuizDAO extends GenericDAO {



    public advogadoJuizDAO(){

    }

    public int addLayer(advogadojuiz layer){
  savingPojo(layer);
  return layer.getId_advogadojuiz();


}
public void removeLayer(advogadojuiz layer){
    removePojo(layer);
}
public int updateLayer(advogadojuiz layer){
    savingPojo(layer);
    return layer.getId_advogadojuiz();
}

public advogadojuiz getLayer(int layerId){
    advogadojuiz layer = gettingPojo(advogadojuiz.class, layerId);
    return layer;
}

public List<advogadojuiz> getLayers(){
   return  getCleanList(advogadojuiz.class, "from advogadojuiz layer");
}

public List<advogadojuiz> getSelectedLayers(){
   return  getCleanList(advogadojuiz.class, "from advogadojuiz layer where tipoad = 'A' ");
}
public List<advogadojuiz> getSelectedMajorLayers(){
   return  getCleanList(advogadojuiz.class, "from advogadojuiz layer where tipoad = 'J' ");
}
}