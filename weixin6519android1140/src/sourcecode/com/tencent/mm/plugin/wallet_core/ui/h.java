package com.tencent.mm.plugin.wallet_core.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet.a.e;
import com.tencent.mm.plugin.wallet.a.f;
import com.tencent.mm.plugin.wallet.a.g;
import com.tencent.mm.plugin.wallet.a.q;
import com.tencent.mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.l;
import com.tencent.mm.plugin.wallet_core.model.l.a;
import com.tencent.mm.plugin.wallet_core.model.l.b;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.plugin.wxpay.a.j;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.MaxListView;
import com.tencent.mm.ui.base.k;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public final class h
  extends k
{
  private LayoutInflater CJ;
  private View jBw;
  private a qZB;
  private MaxListView rmF;
  private TextView rmG;
  private a rmH;
  private b rmI;
  
  private h(Context paramContext)
  {
    super(paramContext, a.j.tio);
    GMTrace.i(7018110779392L, 52289);
    this.CJ = LayoutInflater.from(paramContext);
    this.jBw = LayoutInflater.from(paramContext).inflate(a.g.sPn, null);
    this.rmF = ((MaxListView)this.jBw.findViewById(a.f.sJD));
    this.rmG = ((TextView)this.jBw.findViewById(a.f.sJB));
    this.rmH = new a();
    this.rmF.setAdapter(this.rmH);
    this.jBw.findViewById(a.f.sJC).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6916910612480L, 51535);
        h.a(h.this);
        h.this.dismiss();
        GMTrace.o(6916910612480L, 51535);
      }
    });
    GMTrace.o(7018110779392L, 52289);
  }
  
  public static h a(Context paramContext, Orders paramOrders, String paramString, b paramb)
  {
    GMTrace.i(7018513432576L, 52292);
    h localh = new h(paramContext);
    localh.setOnCancelListener(null);
    localh.setCancelable(true);
    localh.qZB = b.rks.a(paramOrders);
    if (localh.qZB == null)
    {
      w.w("MicroMsg.WalletFavorDialog", "mFavorLogicHelper null & dismiss");
      localh.dismiss();
    }
    Object localObject3;
    Object localObject1;
    int i;
    for (;;)
    {
      localh.rmI = paramb;
      localh.show();
      com.tencent.mm.ui.base.h.a(paramContext, localh);
      GMTrace.o(7018513432576L, 52292);
      return localh;
      paramOrders = localh.rmH;
      localObject3 = paramOrders.rmJ.qZB.rkm;
      localObject1 = paramOrders.rmJ.qZB.Ky(paramString);
      paramOrders.rmL = paramOrders.rmJ.qZB.bzs();
      paramOrders.rmM = paramOrders.rmJ.qZB.Ku((String)localObject1);
      paramOrders.rmK = -1;
      i = 0;
      for (;;)
      {
        if (i < paramOrders.rmL.size()) {
          if (((q)paramOrders.rmL.get(i)).qYq == 0) {
            break label272;
          }
        }
        label272:
        for (j = 1; j != 0; j = 0)
        {
          paramOrders.rmK = i;
          paramString = new LinkedList();
          if (paramOrders.rmL == null) {
            break label287;
          }
          i = 0;
          while (i < paramOrders.rmL.size())
          {
            paramString.add(((q)paramOrders.rmL.get(i)).qXt);
            i += 1;
          }
        }
        i += 1;
      }
      label287:
      w.w("MicroMsg.WalletFavorDialog", "func[setCouponInfo] mFavorList null");
      i = 0;
      label297:
      if (i != 0) {
        break label671;
      }
      w.w("MicroMsg.WalletFavorDialog", "initFavorInfo failed & dismiss");
      localh.dismiss();
    }
    LinkedList localLinkedList = new LinkedList();
    if ((localObject3 != null) && (((f)localObject3).qXA != null))
    {
      i = 0;
      while (i < ((f)localObject3).qXA.size())
      {
        localObject2 = ((q)((f)localObject3).qXA.get(i)).qXt;
        if (!paramString.contains(localObject2)) {
          localLinkedList.add(localObject2);
        }
        i += 1;
      }
    }
    Object localObject2 = new LinkedList();
    label449:
    String str;
    if ((localObject3 != null) && (((f)localObject3).qXB != null) && (((f)localObject3).qXB.qXL != null))
    {
      localObject3 = ((f)localObject3).qXB.qXL;
      i = 0;
      if (i >= ((List)localObject3).size()) {
        break label563;
      }
      str = ((com.tencent.mm.plugin.wallet.a.h)((List)localObject3).get(i)).qXN;
      j = 0;
      label481:
      if (j >= localLinkedList.size()) {
        break label702;
      }
      if (!str.contains((CharSequence)localLinkedList.get(j))) {}
    }
    label563:
    label671:
    label702:
    for (int j = 1;; j = 0)
    {
      if (j == 0) {
        ((List)localObject2).add(str);
      }
      i += 1;
      break label449;
      j += 1;
      break label481;
      w.w("MicroMsg.WalletFavorDialog", "func[setCouponInfo] favorInfo.favorComposeList or favorInfo.favorComposeList.favorComposeInfo null");
      i = 0;
      break label297;
      localLinkedList = new LinkedList();
      if ((!bg.nm((String)localObject1)) && (!((String)localObject1).equals("0")))
      {
        localObject1 = ((String)localObject1).split("-");
        if (localObject1 != null)
        {
          i = 0;
          while (i < localObject1.length)
          {
            localLinkedList.add(localObject1[i]);
            i += 1;
          }
        }
        w.w("MicroMsg.WalletFavorDialog", "func[setCouponInfo] preKeyArr null");
        i = 0;
        break label297;
      }
      paramOrders.rmN.c(paramString, localLinkedList, (List)localObject2);
      i = 1;
      break label297;
      localh.rmG.setText(a.i.tbF);
      localh.rmF.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          GMTrace.i(6981871992832L, 52019);
          paramAnonymousAdapterView = h.b(h.this);
          paramAnonymousView = paramAnonymousAdapterView.rmN;
          if (paramAnonymousInt < paramAnonymousView.rgD.size())
          {
            int i = ((l.b)paramAnonymousView.rgD.get(paramAnonymousInt)).rgL;
            int j = l.a.rgH;
            switch (com.tencent.mm.plugin.wallet_core.model.l.1.rgF[(i - 1)])
            {
            }
          }
          for (;;)
          {
            paramAnonymousView.byq();
            paramAnonymousAdapterView.notifyDataSetChanged();
            GMTrace.o(6981871992832L, 52019);
            return;
            paramAnonymousView.dx(paramAnonymousInt, l.a.rgH);
            continue;
            paramAnonymousView.dx(paramAnonymousInt, l.a.rgI);
          }
        }
      });
      break;
    }
  }
  
  private void bzB()
  {
    GMTrace.i(7018781868032L, 52294);
    w.d("MicroMsg.WalletFavorDialog", "On selection done");
    if (this.rmH != null)
    {
      Object localObject = this.rmH.rmN;
      localObject = ((l)localObject).a(((l)localObject).rgD, -1);
      localObject = this.qZB.Kx((String)localObject);
      this.rmI.a((FavorPayInfo)localObject);
    }
    GMTrace.o(7018781868032L, 52294);
  }
  
  public final void dismiss()
  {
    GMTrace.i(7018379214848L, 52291);
    try
    {
      super.dismiss();
      GMTrace.o(7018379214848L, 52291);
      return;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.WalletFavorDialog", "dismiss exception, e = " + localException.getMessage());
      GMTrace.o(7018379214848L, 52291);
    }
  }
  
  protected final void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7018244997120L, 52290);
    super.onCreate(paramBundle);
    setContentView(this.jBw);
    GMTrace.o(7018244997120L, 52290);
  }
  
  public final boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(7018916085760L, 52295);
    if (paramInt == 4) {
      bzB();
    }
    boolean bool = super.onKeyUp(paramInt, paramKeyEvent);
    GMTrace.o(7018916085760L, 52295);
    return bool;
  }
  
  public final void setCancelable(boolean paramBoolean)
  {
    GMTrace.i(7018647650304L, 52293);
    super.setCancelable(paramBoolean);
    setCanceledOnTouchOutside(paramBoolean);
    GMTrace.o(7018647650304L, 52293);
  }
  
  final class a
    extends BaseAdapter
  {
    int rmK;
    List<q> rmL;
    com.tencent.mm.plugin.wallet.a.h rmM;
    l<String> rmN;
    
    public a()
    {
      GMTrace.i(6977577025536L, 51987);
      this.rmK = -1;
      this.rmL = new LinkedList();
      this.rmM = null;
      this.rmN = new l()
      {
        public final String a(Vector<l<String>.b> paramAnonymousVector, int paramAnonymousInt)
        {
          GMTrace.i(7014621118464L, 52263);
          if (paramAnonymousVector == null)
          {
            w.w("MicroMsg.WalletFavorDialog", "func[getComposedKey] keyList null");
            GMTrace.o(7014621118464L, 52263);
            return "";
          }
          StringBuilder localStringBuilder = new StringBuilder();
          int i = 0;
          while (i < paramAnonymousVector.size())
          {
            int j = ((l.b)paramAnonymousVector.get(i)).rgL;
            if ((i == paramAnonymousInt) || (j == l.a.rgH)) {
              localStringBuilder.append((String)((l.b)paramAnonymousVector.get(i)).rgK + "-");
            }
            i += 1;
          }
          if (localStringBuilder.length() == 0)
          {
            GMTrace.o(7014621118464L, 52263);
            return "0";
          }
          if (localStringBuilder.length() > 1) {
            localStringBuilder.deleteCharAt(localStringBuilder.length() - 1);
          }
          paramAnonymousVector = localStringBuilder.toString();
          GMTrace.o(7014621118464L, 52263);
          return paramAnonymousVector;
        }
      };
      GMTrace.o(6977577025536L, 51987);
    }
    
    public final int getCount()
    {
      GMTrace.i(6977711243264L, 51988);
      int i = this.rmL.size();
      GMTrace.o(6977711243264L, 51988);
      return i;
    }
    
    public final Object getItem(int paramInt)
    {
      GMTrace.i(6977845460992L, 51989);
      Object localObject = this.rmL.get(paramInt);
      GMTrace.o(6977845460992L, 51989);
      return localObject;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(6977979678720L, 51990);
      GMTrace.o(6977979678720L, 51990);
      return 0L;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(6978113896448L, 51991);
      Object localObject3;
      label164:
      label195:
      Object localObject2;
      int i;
      if (paramView == null)
      {
        paramView = h.c(h.this).inflate(a.g.sPk, paramViewGroup, false);
        paramViewGroup = new h.c();
        paramViewGroup.rmP = paramView.findViewById(a.f.sJq);
        paramViewGroup.izE = ((TextView)paramView.findViewById(a.f.sJp));
        paramViewGroup.rmR = ((TextView)paramView.findViewById(a.f.sJo));
        paramViewGroup.jXT = ((TextView)paramView.findViewById(a.f.sJn));
        paramViewGroup.rmS = ((CheckBox)paramView.findViewById(a.f.sJm));
        paramViewGroup.rmQ = ((ImageView)paramView.findViewById(a.f.sJl));
        paramView.setTag(paramViewGroup);
        localObject3 = (q)getItem(paramInt);
        if ((paramInt != this.rmK) || (this.rmK <= 0)) {
          break label425;
        }
        paramViewGroup.rmP.setVisibility(0);
        paramViewGroup.rmQ.setVisibility(8);
        if (bg.nm(((q)localObject3).qYm)) {
          break label445;
        }
        paramViewGroup.izE.setText(((q)localObject3).qYm);
        paramViewGroup.izE.setVisibility(0);
        localObject1 = ((q)localObject3).qXt;
        if ((this.rmM == null) || (this.rmM.qXP == null)) {
          break label466;
        }
        localObject2 = this.rmM.qXP;
        i = 0;
        label231:
        if (i >= ((List)localObject2).size()) {
          break label466;
        }
        if (!((String)localObject1).equals(((e)((List)localObject2).get(i)).qXt)) {
          break label457;
        }
        localObject1 = (e)((List)localObject2).get(i);
        label280:
        localObject2 = ((q)localObject3).qXu;
        localObject3 = ((q)localObject3).qXv;
        if (localObject1 == null) {
          break label533;
        }
        localObject2 = ((e)localObject1).qXu;
      }
      label338:
      label363:
      label425:
      label445:
      label457:
      label466:
      label484:
      label496:
      label533:
      for (Object localObject1 = ((e)localObject1).qXv;; localObject1 = localObject3)
      {
        if (!bg.nm((String)localObject2))
        {
          paramViewGroup.rmR.setText((CharSequence)localObject2);
          paramViewGroup.rmR.setVisibility(0);
          if (bg.nm((String)localObject1)) {
            break label484;
          }
          paramViewGroup.jXT.setText((CharSequence)localObject1);
          paramViewGroup.jXT.setVisibility(0);
          paramInt = ((l.b)this.rmN.rgD.get(paramInt)).rgL;
          if (paramInt != l.a.rgG) {
            break label496;
          }
          paramViewGroup.rmS.setChecked(false);
          paramViewGroup.rmS.setEnabled(false);
        }
        for (;;)
        {
          GMTrace.o(6978113896448L, 51991);
          return paramView;
          paramViewGroup = (h.c)paramView.getTag();
          break;
          paramViewGroup.rmP.setVisibility(8);
          paramViewGroup.rmQ.setVisibility(0);
          break label164;
          paramViewGroup.izE.setVisibility(8);
          break label195;
          i += 1;
          break label231;
          localObject1 = null;
          break label280;
          paramViewGroup.rmR.setVisibility(8);
          break label338;
          paramViewGroup.jXT.setVisibility(8);
          break label363;
          paramViewGroup.rmS.setEnabled(true);
          if (paramInt == l.a.rgH) {
            paramViewGroup.rmS.setChecked(true);
          } else {
            paramViewGroup.rmS.setChecked(false);
          }
        }
      }
    }
  }
  
  public static abstract interface b
  {
    public abstract void a(FavorPayInfo paramFavorPayInfo);
  }
  
  static final class c
  {
    TextView izE;
    TextView jXT;
    View rmP;
    ImageView rmQ;
    TextView rmR;
    CheckBox rmS;
    
    c()
    {
      GMTrace.i(7017708126208L, 52286);
      GMTrace.o(7017708126208L, 52286);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\ui\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */