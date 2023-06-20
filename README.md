# AplicativoSustentavel
Primeiro commit do app
Aqui os códigos pra mudar na aplicação
-- Código para mudar de tela --

public void ParaHome(View ver){
        Intent comeco = new Intent(this, ActivityHome.class);
       startActivity(comeco);
    }

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

-- Código para identificar o OnClick --

android:OnClick="onImageButtonClicked" -- Na linha code da Activity.xml --
