package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bj.d;
import com.tencent.mm.br.a;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.h;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.h.a;
import com.tencent.mm.sdk.platformtools.w;
import org.json.JSONException;
import org.json.JSONObject;

public final class g
  extends b
{
  private LinearLayout lgp;
  private ImageView pGD;
  private TextView pGE;
  private LinearLayout pGF;
  int pGG;
  public h pGN;
  private View pGO;
  private ImageView pGP;
  
  public g(Context paramContext, h paramh, ViewGroup paramViewGroup)
  {
    super(paramContext, paramh, paramViewGroup);
    GMTrace.i(8227680944128L, 61301);
    this.pGN = paramh;
    GMTrace.o(8227680944128L, 61301);
  }
  
  public final boolean L(JSONObject paramJSONObject)
  {
    GMTrace.i(16642058747904L, 123993);
    if (!super.L(paramJSONObject))
    {
      GMTrace.o(16642058747904L, 123993);
      return false;
    }
    try
    {
      paramJSONObject.put("clickCount", this.pGG);
      GMTrace.o(16642058747904L, 123993);
      return true;
    }
    catch (JSONException paramJSONObject)
    {
      w.printErrStackTrace("AdLandingBorderedComp", paramJSONObject, "", new Object[0]);
      GMTrace.o(16642058747904L, 123993);
    }
    return false;
  }
  
  protected final int aXW()
  {
    GMTrace.i(8228083597312L, 61304);
    int i = i.g.pfi;
    GMTrace.o(8228083597312L, 61304);
    return i;
  }
  
  public final View bkC()
  {
    GMTrace.i(8227815161856L, 61302);
    View localView = this.hqF;
    this.pGP = ((ImageView)localView.findViewById(i.f.pbf));
    this.pGD = ((ImageView)localView.findViewById(i.f.oYj));
    this.pGE = ((TextView)localView.findViewById(i.f.btg));
    this.pGF = ((LinearLayout)localView.findViewById(i.f.pba));
    this.lgp = ((LinearLayout)localView.findViewById(i.f.brL));
    this.pGO = this.pGF;
    localView = this.hqF;
    GMTrace.o(8227815161856L, 61302);
    return localView;
  }
  
  protected final void bkI()
  {
    GMTrace.i(8227949379584L, 61303);
    this.pGE.setText(this.pGN.pDY.mwJ);
    if (this.pGN.pEH)
    {
      this.pGP.setImageDrawable(a.b(this.context, i.e.oXN));
      this.pGD.setImageDrawable(a.b(this.context, i.e.oYk));
      this.pGE.setTextColor(-16777216);
      this.pGF.setBackgroundResource(i.e.oXu);
    }
    for (;;)
    {
      this.pGF.setPadding((int)this.pGN.pED, 0, (int)this.pGN.pEE, 0);
      this.lgp.setPadding(0, (int)this.pGN.pEB, 0, (int)this.pGN.pEC);
      a(this.pGF);
      View.OnClickListener local1 = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(8257343062016L, 61522);
          paramAnonymousView = g.this;
          paramAnonymousView.pGG += 1;
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("map_view_type", 1);
          paramAnonymousView.putExtra("kwebmap_slat", g.this.pGN.pDY.mwH);
          paramAnonymousView.putExtra("kwebmap_lng", g.this.pGN.pDY.mwI);
          paramAnonymousView.putExtra("kwebmap_scale", g.this.pGN.pDY.eMn);
          paramAnonymousView.putExtra("kPoiName", g.this.pGN.pDY.eQm);
          paramAnonymousView.putExtra("Kwebmap_locaion", g.this.pGN.pDY.mwJ);
          w.i("AdLandingBorderedComp", "locatint to slat " + g.this.pGN.pDY.mwH + ", slong " + g.this.pGN.pDY.mwI + ", " + g.this.pGN.pDY.eQm);
          d.b(g.this.context, "location", ".ui.RedirectUI", paramAnonymousView, 2);
          GMTrace.o(8257343062016L, 61522);
        }
      };
      if (this.pGO != null) {
        this.pGO.setOnClickListener(local1);
      }
      GMTrace.o(8227949379584L, 61303);
      return;
      this.pGP.setImageDrawable(a.b(this.context, i.e.oXM));
      this.pGD.setImageDrawable(a.b(this.context, i.e.oYj));
      this.pGE.setTextColor(-1);
      this.pGF.setBackgroundResource(i.e.oXv);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\AdLandingPagesStorage\AdLandingPageComponent\component\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */