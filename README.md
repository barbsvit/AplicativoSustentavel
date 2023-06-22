# AplicativoSustentavel
Primeiro commit do app

Integrantes: José Vinicius e Barbara Vitória 


Nossa aplicação consiste em um jogo sustentável baseado em um anime/mangá com temática de voleibol onde a pessoa que estiver jogando terá que escplher materiais sustentáveis para a criação de uma bola de vôlei. 
Ao final da aplicação, é possível voltar para a tela onde se encontram os objetivos, as metas e informações sobre os materiais que podem ser usados durante o jogo, uma função que vai ser ambientada nos próximos bimestres. 



Alguns códigos que usamos para mudar a aplicação: 

-- Código para mudar de tela --

public void ParaHome(View ver){
        Intent comeco = new Intent(this, ActivityHome.class);
       startActivity(comeco);
    }



Esse código infelizmente não funcionou em exemplo de aplicação, teremos que mudar isso mais pra frente 

-- Código do ImageButton --

 @SuppressLint("ConstantResourceId")
    public void onImageButtonClicked(View view){
        this.view = view;
        boolean checked= ((ImageButton) view).isShown();
        switch(view.getId()) {
            case R.id.KiyokoShimizu:
                boolean ImageButton;
                boolean ImageButton1;
                if (checked)
                    ImageButton= checked;
                    break;
            default:
            case R.id.TobioKageyama:
                if (checked)
                ImageButton1= checked;
                    break;
        }

Este código também não funcionou, tentaremos melhorar isso. 
-- Código para identificar o OnClick --

android:OnClick="onImageButtonClicked" -- Na linha code da Activity.xml --
