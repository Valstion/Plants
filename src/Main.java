public class Main extends Plants{
    public static void main(String[] args) {
        Plants[] augalai = new Plants[4];
        augalai[0] = new Plants();
        augalai[0].setPavadinimas("Agrastas");
        augalai[0].setLotyniskasPavadinimas("Ribes uva-crispa");
        augalai[0].setVienmetis(true);
        augalai[0].setAugaZemyne("Europoje");
        augalai[0].setAugaloAukstis(1.5);
        augalai[0].setValgomas(true);
        augalai[1] = new Plants();
        augalai[1].setPavadinimas("Eglė");
        augalai[1].setLotyniskasPavadinimas("Picea abies");
        augalai[1].setVienmetis(false);
        augalai[1].setAugaZemyne("Europoje");
        augalai[1].setAugaloAukstis(10.0);
        augalai[1].setValgomas(false);
        augalai[2] = new Plants();
        augalai[2].setPavadinimas("Tulpe");
        augalai[2].setLotyniskasPavadinimas("Tulipa");
        augalai[2].setVienmetis(true);
        augalai[2].setAugaZemyne("Azijoje");
        augalai[2].setAugaloAukstis(0.6);
        augalai[2].setValgomas(false);
        augalai[3] = new Plants();
        augalai[3].setPavadinimas("Liepa");
        augalai[3].setLotyniskasPavadinimas("Tilia");
        augalai[3].setVienmetis(false);
        augalai[3].setAugaZemyne("Europoje");
        augalai[3].setAugaloAukstis(20.0);
        augalai[3].setValgomas(false);
        for (Plants augalas : augalai) {
            System.out.println("Augalas: " + augalas.getPavadinimas());
            System.out.println("Lotyniškas pavadinimas: " + augalas.getLotyniskasPavadinimas());
            System.out.println("Vienmetis: " + augalas.isVienmetis());
            System.out.println("Auga žemyne: " + augalas.getAugaZemyne());
            System.out.println("Augalo aukštis (metrais): " + augalas.getAugaloAukstis());
            System.out.println("Ar valgomas: " + augalas.isValgomas());
            System.out.println("------------------------");
        }
    }
}