public class SporArabaFactory implements IAracFactory{

    @Override
    public IMotor motoruUret()
    {
        IMotor spormotor = new SporArabaMotor();
        spormotor.motoruUret();
        return spormotor;
    }

    @Override
    public ILastik lastigiUret() {

        ILastik sporlastik = new SporArabaLastik();
        sporlastik.lastigiUret();
        return sporlastik;
    }

    @Override
    public IIçmekan içMekanUret() {

        IIçmekan sporicmekan = new SporArabaİçMekan();
        sporicmekan.içMekanUret();
        return sporicmekan;
    }
}