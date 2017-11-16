package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.mm.pluginsdk.ui.d.c;
import com.tencent.mm.pluginsdk.ui.d.c.a;
import com.tencent.mm.sdk.platformtools.w;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class d
  extends b
{
  LinearLayout lgp;
  private ImageView pGC;
  private ImageView pGD;
  private TextView pGE;
  LinearLayout pGF;
  int pGG;
  
  public d(Context paramContext, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.d paramd, ViewGroup paramViewGroup)
  {
    super(paramContext, paramd, paramViewGroup);
    GMTrace.i(8269959528448L, 61616);
    GMTrace.o(8269959528448L, 61616);
  }
  
  public final boolean L(JSONObject paramJSONObject)
  {
    GMTrace.i(16642192965632L, 123994);
    if (!super.L(paramJSONObject))
    {
      GMTrace.o(16642192965632L, 123994);
      return false;
    }
    try
    {
      paramJSONObject.put("clickCount", this.pGG);
      GMTrace.o(16642192965632L, 123994);
      return true;
    }
    catch (JSONException paramJSONObject)
    {
      w.printErrStackTrace("AdLandingBorderedComp", paramJSONObject, "", new Object[0]);
      GMTrace.o(16642192965632L, 123994);
    }
    return false;
  }
  
  protected final int aXW()
  {
    GMTrace.i(8270093746176L, 61617);
    int i = i.g.pfi;
    GMTrace.o(8270093746176L, 61617);
    return i;
  }
  
  public final View bkC()
  {
    GMTrace.i(8270362181632L, 61619);
    if (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.d)this.pGS).pDV.isEmpty())
    {
      GMTrace.o(8270362181632L, 61619);
      return null;
    }
    View localView = this.hqF;
    this.pGC = ((ImageView)localView.findViewById(i.f.pbf));
    this.pGD = ((ImageView)localView.findViewById(i.f.oYj));
    this.pGE = ((TextView)localView.findViewById(i.f.btg));
    this.lgp = ((LinearLayout)localView.findViewById(i.f.brL));
    this.pGF = ((LinearLayout)localView.findViewById(i.f.pba));
    localView = this.hqF;
    GMTrace.o(8270362181632L, 61619);
    return localView;
  }
  
  public final com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.d bkH()
  {
    GMTrace.i(16043447681024L, 119533);
    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.d locald = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.d)this.pGS;
    GMTrace.o(16043447681024L, 119533);
    return locald;
  }
  
  protected final void bkI()
  {
    GMTrace.i(8270227963904L, 61618);
    this.pGE.setText((CharSequence)((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.d)this.pGS).pDV.get(0));
    if (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.d)this.pGS).pEH)
    {
      this.pGC.setImageDrawable(a.b(this.context, i.e.oYA));
      this.pGD.setImageDrawable(a.b(this.context, i.e.oYk));
      this.pGE.setTextColor(-16777216);
      this.pGF.setBackgroundResource(i.e.oXu);
    }
    for (;;)
    {
      this.pGF.setPadding((int)((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.d)this.pGS).pED, 0, (int)((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.d)this.pGS).pEE, 0);
      this.lgp.setPadding(0, (int)((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.d)this.pGS).pEB, 0, (int)((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.d)this.pGS).pEC);
      a(this.pGF);
      this.pGF.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(8236405096448L, 61366);
          paramAnonymousView = d.this;
          paramAnonymousView.pGG += 1;
          if (c.a.tDL == null)
          {
            GMTrace.o(8236405096448L, 61366);
            return;
          }
          if (d.this.bkH().pDV.size() > 1)
          {
            c.a.tDL.a(d.this.context, d.this.bkH().pDV, new DialogInterface.OnDismissListener()
            {
              public final void onDismiss(DialogInterface paramAnonymous2DialogInterface)
              {
                GMTrace.i(17126316310528L, 127601);
                ab.dg(d.this.context);
                GMTrace.o(17126316310528L, 127601);
              }
            });
            GMTrace.o(8236405096448L, 61366);
            return;
          }
          if (d.this.bkH().pDV.size() > 0) {
            AdLandingPagesProxy.getInstance().confirmDialPhoneNum((Activity)d.this.context, (String)d.this.bkH().pDV.get(0));
          }
          GMTrace.o(8236405096448L, 61366);
        }
      });
      GMTrace.o(8270227963904L, 61618);
      return;
      this.pGC.setImageDrawable(a.b(this.context, i.e.oYz));
      this.pGD.setImageDrawable(a.b(this.context, i.e.oYj));
      this.pGE.setTextColor(-1);
      this.pGF.setBackgroundResource(i.e.oXv);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\AdLandingPagesStorage\AdLandingPageComponent\component\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */