
package controller.managebeans;

import javafx.scene.shape.DrawMode;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *teste
 * @author jorge
 */
@Named(value = "produtosRepositorioMB")
@RequestScoped
public class ProdutosRepositorioMB {

    public String getDescricaoproduto(int a) {
        return descricaoproduto[a];
    }

    public void setDescricaoproduto(String[] descricaoproduto) {
        this.descricaoproduto = descricaoproduto;
    }

    public String getImagemproduto(int a) {
        return imagemproduto[a];
    }

    public void setImagemproduto(String[] imagemproduto) {
        this.imagemproduto = imagemproduto;
    }

    public String getPrecoproduto(int a) {
        return precoproduto[a];
    }

    public void setPrecoproduto(String[] precoproduto) {
        this.precoproduto = precoproduto;
    }

    public String getNomeproduto(int a) {
        return nomeproduto[a];
    }

    public void setNomeproduto(String[] nomeproduto) {
        this.nomeproduto = nomeproduto;
    }

    public ProdutosRepositorioMB() {
    }
    private String[] nomeproduto = {"Cadeira Gamer Mud Racer 10", "Placa de Vídeo GTX 1660 Super","Fonte de Energia 80 Plus 750W"}; 
    
    private String[] precoproduto = {"R$1.813,53", "R$2.499,99","R$699,99"};

    private String[] imagemproduto = {"resources/imagens/Cadeira Gamer Mud Racer.png","resources/imagens/Placa de Video Nvidia 1660 Super.png", "resources/imagens/Fonte de Energia 80 plus 750W.png"};
    
    private String[] descricaoproduto = {"Dimensões(CxLxA):76x59x129~139cm </br>Espuma moldada D45 Apoios de braço: Poliuretano e metal(tecnologia 4D)</br>Base: 350mm(nylon)</br>Diâmetro da Base: 645mm</br>Rodízios: PU 65mm</br>Ajuste de altura: 100mm</br>Função Relax (Tilt Mechanism): 3º~16º</br>Função de Rotação</br>Pistão a gás(Classe 4)</br>Suporta até 180Kg",
        "ESPECIFICAÇÕES TÉCNICAS</br>GPU: GTX 1660 SUPER</br>Chipset: TU116</br>CUDA Cores: 1408</br>Base clock: 1530 MHz</br>Boost clock: 1830 MHz</br>Tipo de memória: GDDR6</br>Memória: 6GB</br>Velocidade da memória: 14Gbps</br>Interface de memória: 192 bits</br>Largura de banda: 336 (GB/s)</br>Energia da placa: 125W</br>Dimensões da placa: 235 x 115 x 40 mm</br>Largura: 2 slots</br>Cooler: Dual Fan</br>Saídas de vídeo: DisplayPort 1,4 HDMI 2.0b DVI</br>Garantia de fabrica 2 (dois) anos a partir da compra / emissão da nota fiscal e mais 1 (um) ano mediante registro no site da PCNO",
        "Marca: PCYES</br>Modelo: 26215 Electro</br>Potência: 750W</br>Padrão: ATX 12V</br>PFC: Ativo</br>Certificado de Eficiência: 80PLUS BRONZE</br>Tensão: 127 ~ 220 V (Seleção Automática)</br>Cabos:</br>1x ATX 12V (20+4): 600mm;</br>1x EPS 8 pinos 12V (4+4): 700mm;</br>2x PCI-E 8 pinos (6+2): 600x100mm;</br>2x SATAxSATAxSATA: 500x100x100mm;</br>1x IDExIDExIDE: 500x100x100mm;</br>1x IDExIDExFDD: 500x100x100mm;</br>1x adaptador IDExIDE para PCI-E 8 pinos (6+2): 150x150mm;</br>Dimensões: 150 x 85 x 140 mm"};
}
