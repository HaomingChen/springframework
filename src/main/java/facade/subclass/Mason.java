package facade.subclass;

public class Mason {

    BrickLayer brickLayer = new BrickLayer();
    BrickWorker brickWorker = new BrickWorker();

    public void buildHouse(){
        brickLayer.layerBrick();
        brickWorker.buildBrick();
    }
}
