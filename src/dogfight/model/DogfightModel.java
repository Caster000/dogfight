import java.util.*;




public class DogFightModel{
    public DogFightModel();
    public IArea getArea(){return Area}
    public void buildArea(Dimension dimension);
    public void addMobile(IMobile Mobile);
    public void removeMobile(IMobile Mobile);
    public ArrayList<IMobile> getMobiles(){return Mobiles}
    public IMobile getMobileByPlayer(int player){return MobileByPlayer}
    public void setMobilesHavesMoved(){this.MobilesHavesMoved = MobilesHavesMoved}

}