public class SUVFactory implements IAracFactory{

    @Override
    public IMotor motoruUret()
    {
        IMotor suvmotor = new SUVMotor();
        suvmotor.motoruUret();
        return suvmotor;
    }

    @Override
    public ILastik lastigiUret() {

        ILastik suvlastik = new SUVLastik();
        suvlastik.lastigiUret();
        return suvlastik;
    }

    @Override
    public IIçmekan içMekanUret() {

        IIçmekan suvicmekan = new SUVİçMekan();
        suvicmekan.içMekanUret();
        return suvicmekan;
    }
}
