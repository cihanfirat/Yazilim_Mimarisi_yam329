public class SedanFactory implements IAracFactory{

    @Override
    public IMotor motoruUret()
    {
        IMotor sedanmotor = new SedanMotor();
        sedanmotor.motoruUret();
        return sedanmotor;
    }

    @Override
    public ILastik lastigiUret() {

        ILastik sedanlastik = new SedanLastik();
        sedanlastik.lastigiUret();
        return sedanlastik;
    }

    @Override
    public IIçmekan içMekanUret() {

        IIçmekan sedanicmekan = new SedanİçMekan();
        sedanicmekan.içMekanUret();
        return sedanicmekan;
    }
}
