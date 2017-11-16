package com.tencent.mm.plugin.wallet_core.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.g.a.ob;
import com.tencent.mm.g.a.sl;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.wallet.a.q;
import com.tencent.mm.plugin.wallet_core.c.l;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.ad;
import com.tencent.mm.plugin.wallet_core.model.af;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.h;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.wallet.WalletIconImageView;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.i.a;
import com.tencent.mm.ui.p;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView.a;
import java.util.LinkedList;
import java.util.List;

@com.tencent.mm.ui.base.a(19)
public class WalletBankcardIdUI
  extends WalletBaseUI
  implements WalletFormView.a
{
  private int gRb;
  com.tencent.mm.sdk.b.c qWZ;
  private Button qXb;
  com.tencent.mm.sdk.b.c raZ;
  private boolean rkA;
  private boolean rkB;
  protected WalletFormView rkw;
  protected WalletFormView rkx;
  private Bankcard rky;
  private a rkz;
  
  public WalletBankcardIdUI()
  {
    GMTrace.i(7015292207104L, 52268);
    this.rkA = false;
    this.gRb = -1;
    this.qWZ = new com.tencent.mm.sdk.b.c() {};
    this.raZ = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(7015292207104L, 52268);
  }
  
  private boolean QS()
  {
    GMTrace.i(7016365948928L, 52276);
    if (this.rkw.dJ(null))
    {
      this.qXb.setEnabled(true);
      this.qXb.setClickable(true);
      GMTrace.o(7016365948928L, 52276);
      return true;
    }
    this.qXb.setEnabled(false);
    this.qXb.setClickable(false);
    GMTrace.o(7016365948928L, 52276);
    return false;
  }
  
  protected final void MP()
  {
    GMTrace.i(7015829078016L, 52272);
    this.qXb = ((Button)findViewById(a.f.bQR));
    this.rkw = ((WalletFormView)findViewById(a.f.ssQ));
    com.tencent.mm.wallet_core.ui.formview.a.a(this.rkw);
    this.rkx = ((WalletFormView)findViewById(a.f.sCF));
    Object localObject1;
    label126:
    label140:
    Object localObject2;
    if (this.ui.getBoolean("key_bind_show_change_card", false))
    {
      com.tencent.mm.wallet_core.ui.formview.a.d(this, this.rkx);
      this.rkw.xFu = this;
      this.qXb.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(6919058096128L, 51551);
          g.ork.i(11353, new Object[] { Integer.valueOf(1), Integer.valueOf(0) });
          WalletBankcardIdUI.this.bxP();
          GMTrace.o(6919058096128L, 51551);
        }
      });
      localObject1 = cmp();
      if (localObject1 == null) {
        break label635;
      }
      this.rkB = ((com.tencent.mm.wallet_core.b)localObject1).ler.getBoolean("key_is_realname_verify_process", false);
      if (!this.rkB) {
        break label643;
      }
      oM(a.i.tfn);
      localObject1 = (TextView)findViewById(a.f.swf);
      if ((!com.tencent.mm.plugin.wallet_core.model.n.byx().byP()) && (!com.tencent.mm.plugin.wallet_core.model.n.byx().byT())) {
        break label653;
      }
      localObject2 = new f(this);
      ((f)localObject2).rmz = new f.a()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(6952880963584L, 51803);
          w.i("Micromsg.WalletInputCardIDUI", "hy: clickable span on click");
          WalletBankcardIdUI.a(WalletBankcardIdUI.this);
          GMTrace.o(6952880963584L, 51803);
        }
      };
      Object localObject3 = getString(a.i.tcj);
      SpannableString localSpannableString = new SpannableString((CharSequence)localObject3);
      localSpannableString.setSpan(localObject2, ((String)localObject3).length() - 6, ((String)localObject3).length(), 33);
      ((TextView)localObject1).setText(localSpannableString);
      ((TextView)localObject1).setMovementMethod(LinkMovementMethod.getInstance());
      label240:
      localObject1 = (FavorPayInfo)this.ui.getParcelable("key_favor_pay_info");
      localObject2 = (Orders)this.ui.getParcelable("key_orders");
      if ((localObject1 != null) && (localObject2 != null))
      {
        localObject3 = b.rks.a((Orders)localObject2);
        localObject2 = (TextView)findViewById(a.f.sIZ);
        if (localObject3 == null) {
          break label693;
        }
        localObject1 = ((a)localObject3).Kt(((a)localObject3).Kw(((FavorPayInfo)localObject1).rgo));
        if (((List)localObject1).size() <= 0) {
          break label684;
        }
        this.rkz = new a(this.vKB.vKW, (List)localObject1);
        ((TextView)localObject2).setText(a.i.tch);
        ((TextView)localObject2).setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(6929258643456L, 51627);
            WalletBankcardIdUI.this.showDialog(1);
            GMTrace.o(6929258643456L, 51627);
          }
        });
        ((TextView)localObject2).setVisibility(0);
      }
      label364:
      localObject1 = com.tencent.mm.plugin.wallet_core.model.n.byx();
      if ((!((af)localObject1).byS()) || (((af)localObject1).apc() == null) || (bg.nm(((af)localObject1).apc().trim())) || (!((af)localObject1).byX())) {
        break label711;
      }
      this.rkx.setVisibility(0);
      this.rkx.setText(((af)localObject1).apc());
      this.rkw.setHint(getString(a.i.taH));
      this.rkx.setClickable(false);
      this.rkx.setEnabled(false);
    }
    for (;;)
    {
      com.tencent.mm.kernel.h.xz();
      localObject1 = (String)com.tencent.mm.kernel.h.xy().xh().get(w.a.vqH, null);
      if (!bg.nm((String)localObject1)) {
        this.rkw.setHint((CharSequence)localObject1);
      }
      this.rky = ((Bankcard)this.ui.getParcelable("key_history_bankcard"));
      if (this.rky != null)
      {
        this.rkw.setText(this.rky.reG);
        this.rkw.a(new TextWatcher()
        {
          public final void afterTextChanged(Editable paramAnonymousEditable)
          {
            GMTrace.i(6923084627968L, 51581);
            GMTrace.o(6923084627968L, 51581);
          }
          
          public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
          {
            GMTrace.i(6922950410240L, 51580);
            if ((WalletBankcardIdUI.this.rkw.QW()) && (!WalletBankcardIdUI.b(WalletBankcardIdUI.this)))
            {
              WalletBankcardIdUI.c(WalletBankcardIdUI.this);
              WalletBankcardIdUI.this.rkw.baC();
            }
            GMTrace.o(6922950410240L, 51580);
          }
          
          public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
          {
            GMTrace.i(6922816192512L, 51579);
            GMTrace.o(6922816192512L, 51579);
          }
        });
      }
      QS();
      com.tencent.mm.plugin.wallet_core.e.c.b(this, this.ui, 2);
      e(this.rkw, 0, false);
      this.rkw.j(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(6953283616768L, 51806);
          g.ork.i(11353, new Object[] { Integer.valueOf(2), Integer.valueOf(0) });
          com.tencent.mm.wallet_core.ui.e.e(WalletBankcardIdUI.this, com.tencent.mm.plugin.wallet_core.model.n.byx().apc());
          GMTrace.o(6953283616768L, 51806);
        }
      });
      if (com.tencent.mm.plugin.wallet_core.model.n.byx().byW().byL())
      {
        this.rkw.ogf.setVisibility(0);
        this.rkw.ogf.setImageResource(a.h.sQZ);
      }
      GMTrace.o(7015829078016L, 52272);
      return;
      com.tencent.mm.wallet_core.ui.formview.a.e(this, this.rkx);
      break;
      label635:
      this.rkB = false;
      break label126;
      label643:
      oM(a.i.tcl);
      break label140;
      label653:
      ((TextView)localObject1).setVisibility(0);
      localObject2 = this.ui.getString("key_custom_bind_tips");
      if (bg.nm((String)localObject2)) {
        break label240;
      }
      ((TextView)localObject1).setText((CharSequence)localObject2);
      break label240;
      label684:
      ((TextView)localObject2).setVisibility(8);
      break label364;
      label693:
      w.w("Micromsg.WalletInputCardIDUI", "favorlogichelper null");
      ((TextView)localObject2).setVisibility(8);
      break label364;
      label711:
      this.rkx.setVisibility(8);
      this.rkw.setHint(getString(a.i.tck));
    }
  }
  
  protected final int Qf()
  {
    GMTrace.i(7016768602112L, 52279);
    GMTrace.o(7016768602112L, 52279);
    return 1;
  }
  
  protected final void bxP()
  {
    GMTrace.i(7015963295744L, 52273);
    if (cmp() == null)
    {
      w.e("Micromsg.WalletInputCardIDUI", "WalletBankcardIdUI doNext, process is null");
      GMTrace.o(7015963295744L, 52273);
      return;
    }
    Object localObject = cmp().ler.getString("kreq_token");
    int i = this.ui.getInt("entry_scene", -1);
    if (this.rky != null)
    {
      localObject = new l(bxg(), null, (PayInfo)this.ui.getParcelable("key_pay_info"), (String)localObject, this.gRb, i);
      ((l)localObject).olm = this.rky.field_bankcardType;
      this.ui.putParcelable("key_history_bankcard", this.rky);
      l((k)localObject);
      GMTrace.o(7015963295744L, 52273);
      return;
    }
    if (QS())
    {
      String str = this.rkw.getText();
      l(new l(bxg(), str, (PayInfo)this.ui.getParcelable("key_pay_info"), (String)localObject, this.gRb, i));
      GMTrace.o(7015963295744L, 52273);
      return;
    }
    com.tencent.mm.ui.base.h.h(this, a.i.tcO, a.i.cUG);
    GMTrace.o(7015963295744L, 52273);
  }
  
  protected final boolean bxq()
  {
    GMTrace.i(7016634384384L, 52278);
    GMTrace.o(7016634384384L, 52278);
    return true;
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(7016231731200L, 52275);
    w.d("Micromsg.WalletInputCardIDUI", " errCode: " + paramInt2 + " errMsg :" + paramString);
    paramString = new Bundle();
    if ((paramInt1 == 0) && (paramInt2 == 0)) {
      if ((paramk instanceof l))
      {
        paramk = (l)paramk;
        paramString.putBoolean("key_need_area", paramk.bxX());
        paramString.putBoolean("key_need_profession", paramk.bxY());
        paramString.putParcelableArray("key_profession_list", paramk.rcz);
        if (paramk.rcv != null)
        {
          if ((paramk.rcv.rfS) && (paramk.rcv.isError()))
          {
            com.tencent.mm.ui.base.h.h(this, a.i.sZK, a.i.cUG);
            GMTrace.o(7016231731200L, 52275);
            return true;
          }
          paramString.putString("bank_name", paramk.rcv.mhU);
          paramString.putParcelable("elemt_query", paramk.rcv);
          paramString.putString("key_card_id", this.rkw.getText());
          com.tencent.mm.wallet_core.a.i(this, paramString);
          GMTrace.o(7016231731200L, 52275);
          return true;
        }
        paramString.putString("bank_name", "");
        paramString.putParcelable("elemt_query", new ElementQuery());
        paramString.putString("key_card_id", this.rkw.getText());
        com.tencent.mm.wallet_core.a.i(this, paramString);
      }
    }
    while ((paramInt2 != 1) || (!(paramk instanceof l)))
    {
      GMTrace.o(7016231731200L, 52275);
      return false;
    }
    paramString.putString("bank_name", "");
    paramString.putParcelable("elemt_query", new ElementQuery());
    paramString.putString("key_card_id", this.rkw.getText());
    com.tencent.mm.wallet_core.a.i(this, paramString);
    GMTrace.o(7016231731200L, 52275);
    return true;
  }
  
  public final void gR(boolean paramBoolean)
  {
    GMTrace.i(7016500166656L, 52277);
    if (!paramBoolean)
    {
      this.rky = null;
      this.ui.putParcelable("key_history_bankcard", null);
    }
    QS();
    GMTrace.o(7016500166656L, 52277);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7015426424832L, 52269);
    int i = a.g.sOT;
    GMTrace.o(7015426424832L, 52269);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7015560642560L, 52270);
    super.onCreate(paramBundle);
    oM(a.i.tcl);
    MP();
    com.tencent.mm.sdk.b.a.vgX.b(this.qWZ);
    com.tencent.mm.sdk.b.a.vgX.b(this.raZ);
    this.gRb = this.ui.getInt("key_bind_scene");
    GMTrace.o(7015560642560L, 52270);
  }
  
  protected Dialog onCreateDialog(int paramInt)
  {
    GMTrace.i(7016097513472L, 52274);
    Object localObject1;
    Object localObject2;
    if (paramInt == 1)
    {
      localObject1 = getLayoutInflater().inflate(a.g.sPx, null);
      ((ListView)((View)localObject1).findViewById(a.f.bcT)).setAdapter(this.rkz);
      localObject2 = new i.a(this);
      ((i.a)localObject2).BN(a.i.tcg);
      ((i.a)localObject2).dg((View)localObject1);
      ((i.a)localObject2).d(null);
      ((i.a)localObject2).BQ(a.i.tbT);
      localObject1 = ((i.a)localObject2).aax();
      GMTrace.o(7016097513472L, 52274);
      return (Dialog)localObject1;
    }
    if ((this.rkB) && (paramInt == 1000))
    {
      localObject1 = getString(a.i.tci);
      localObject2 = com.tencent.mm.wallet_core.a.ad(this);
      if (localObject2 == null) {
        break label213;
      }
    }
    label213:
    for (paramInt = ((com.tencent.mm.wallet_core.b)localObject2).b(this, 1);; paramInt = -1)
    {
      if (paramInt != -1) {
        localObject1 = getString(paramInt);
      }
      localObject1 = com.tencent.mm.ui.base.h.a(this, true, (String)localObject1, "", getString(a.i.cUW), getString(a.i.cTJ), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(6924426805248L, 51591);
          ((com.tencent.mm.plugin.wallet_core.id_verify.a)WalletBankcardIdUI.this.cmp()).c(WalletBankcardIdUI.this, 0);
          WalletBankcardIdUI.this.finish();
          GMTrace.o(6924426805248L, 51591);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(6932479868928L, 51651);
          if (WalletBankcardIdUI.d(WalletBankcardIdUI.this) == null) {}
          for (paramAnonymousDialogInterface = null;; paramAnonymousDialogInterface = WalletBankcardIdUI.e(WalletBankcardIdUI.this).findFocus())
          {
            if ((paramAnonymousDialogInterface != null) && ((paramAnonymousDialogInterface instanceof EditText))) {
              WalletBankcardIdUI.this.aLs();
            }
            GMTrace.o(6932479868928L, 51651);
            return;
          }
        }
      });
      GMTrace.o(7016097513472L, 52274);
      return (Dialog)localObject1;
      localObject1 = super.onCreateDialog(paramInt);
      GMTrace.o(7016097513472L, 52274);
      return (Dialog)localObject1;
    }
  }
  
  public void onDestroy()
  {
    GMTrace.i(7015694860288L, 52271);
    com.tencent.mm.sdk.b.a.vgX.c(this.qWZ);
    com.tencent.mm.sdk.b.a.vgX.c(this.raZ);
    super.onDestroy();
    GMTrace.o(7015694860288L, 52271);
  }
  
  private static final class a
    extends BaseAdapter
  {
    private LayoutInflater CJ;
    private Context mContext;
    List<q> rkD;
    
    public a(Context paramContext, List<q> paramList)
    {
      GMTrace.i(6991267233792L, 52089);
      this.CJ = null;
      this.rkD = new LinkedList();
      this.mContext = null;
      this.CJ = LayoutInflater.from(paramContext);
      this.rkD = paramList;
      this.mContext = paramContext;
      GMTrace.o(6991267233792L, 52089);
    }
    
    public final int getCount()
    {
      GMTrace.i(6991401451520L, 52090);
      if (this.rkD == null)
      {
        GMTrace.o(6991401451520L, 52090);
        return 0;
      }
      int i = this.rkD.size();
      GMTrace.o(6991401451520L, 52090);
      return i;
    }
    
    public final Object getItem(int paramInt)
    {
      GMTrace.i(6991535669248L, 52091);
      Object localObject = this.rkD.get(paramInt);
      GMTrace.o(6991535669248L, 52091);
      return localObject;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(6991669886976L, 52092);
      GMTrace.o(6991669886976L, 52092);
      return 0L;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(6991804104704L, 52093);
      Object localObject;
      if (paramView == null)
      {
        paramView = this.CJ.inflate(a.g.sOZ, paramViewGroup, false);
        paramViewGroup = new a();
        paramViewGroup.rkE = ((ImageView)paramView.findViewById(a.f.sIM));
        paramViewGroup.ojD = ((TextView)paramView.findViewById(a.f.sIL));
        paramViewGroup.rkF = ((TextView)paramView.findViewById(a.f.sIO));
        paramViewGroup.rkG = ((TextView)paramView.findViewById(a.f.sIN));
        paramView.setTag(paramViewGroup);
        localObject = (q)getItem(paramInt);
        if (bg.nm(((q)localObject).nEp)) {
          break label347;
        }
        paramViewGroup.ojD.setText(((q)localObject).nEp);
        paramViewGroup.ojD.setVisibility(0);
        label136:
        if (bg.nm(((q)localObject).qYm)) {
          break label359;
        }
        paramViewGroup.rkF.setText(((q)localObject).qYm);
        paramViewGroup.rkF.setVisibility(0);
        label167:
        if (bg.nm(((q)localObject).qXu)) {
          break label371;
        }
        paramViewGroup.rkG.setText(((q)localObject).qXu);
        paramViewGroup.rkG.setVisibility(0);
      }
      for (;;)
      {
        String str = ((q)localObject).qYs;
        w.v("Micromsg.WalletInputCardIDUI", "bankType:" + ((q)localObject).qYr + ", logurl:" + str);
        paramViewGroup.rkE.setImageBitmap(null);
        if (!bg.nm(str))
        {
          localObject = new c.a();
          com.tencent.mm.ao.n.Je();
          ((c.a)localObject).gKX = null;
          ((c.a)localObject).gKF = com.tencent.mm.compatible.util.e.ghz;
          ((c.a)localObject).gKE = com.tencent.mm.plugin.wallet_core.d.b.EH(str);
          ((c.a)localObject).gKC = true;
          ((c.a)localObject).gKY = true;
          localObject = ((c.a)localObject).Jn();
          com.tencent.mm.ao.n.Jd().a(str, paramViewGroup.rkE, (com.tencent.mm.ao.a.a.c)localObject);
        }
        GMTrace.o(6991804104704L, 52093);
        return paramView;
        paramViewGroup = (a)paramView.getTag();
        break;
        label347:
        paramViewGroup.ojD.setVisibility(8);
        break label136;
        label359:
        paramViewGroup.rkF.setVisibility(8);
        break label167;
        label371:
        paramViewGroup.rkG.setVisibility(8);
      }
    }
    
    final class a
    {
      TextView ojD;
      ImageView rkE;
      TextView rkF;
      TextView rkG;
      
      a()
      {
        GMTrace.i(6960934027264L, 51863);
        GMTrace.o(6960934027264L, 51863);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\ui\WalletBankcardIdUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */