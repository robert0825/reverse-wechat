package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.s;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class i
{
  protected int backgroundColor;
  public Context context;
  protected View hqF;
  private long iyB;
  protected int jsh;
  protected int jsi;
  protected s pGS;
  private int pGT;
  private long pGU;
  boolean pGV;
  protected ViewGroup pGW;
  
  public i(Context paramContext, s params, ViewGroup paramViewGroup)
  {
    GMTrace.i(8239626321920L, 61390);
    this.pGT = 0;
    this.pGU = 0L;
    this.iyB = 0L;
    this.pGV = false;
    this.hqF = null;
    this.context = paramContext;
    this.pGS = params;
    this.pGW = paramViewGroup;
    paramContext = ab.df(paramContext);
    this.jsh = paramContext[0];
    this.jsi = paramContext[1];
    GMTrace.o(8239626321920L, 61390);
  }
  
  private int getGravity()
  {
    GMTrace.i(8241908023296L, 61407);
    int i = 0;
    switch (this.pGS.pEI)
    {
    default: 
      switch (this.pGS.pEJ)
      {
      }
      break;
    }
    for (;;)
    {
      GMTrace.o(8241908023296L, 61407);
      return i;
      i = 80;
      break;
      i = 16;
      break;
      i = 48;
      break;
      i |= 0x1;
      continue;
      i |= 0x3;
      continue;
      i |= 0x5;
    }
  }
  
  public void I(Map<String, Object> paramMap)
  {
    GMTrace.i(20065281900544L, 149498);
    GMTrace.o(20065281900544L, 149498);
  }
  
  public boolean L(JSONObject paramJSONObject)
  {
    GMTrace.i(8241505370112L, 61404);
    if (this.iyB == 0L)
    {
      GMTrace.o(8241505370112L, 61404);
      return false;
    }
    if (this.pGS.pEL)
    {
      GMTrace.o(8241505370112L, 61404);
      return false;
    }
    try
    {
      paramJSONObject.put("cid", this.pGS.pEz);
      paramJSONObject.put("exposureCount", this.pGT);
      paramJSONObject.put("stayTime", this.iyB);
      GMTrace.o(8241505370112L, 61404);
      return true;
    }
    catch (JSONException paramJSONObject)
    {
      w.printErrStackTrace("MicroMsg.Sns.AdLandingPageBaseComponent", paramJSONObject, "", new Object[0]);
      GMTrace.o(8241505370112L, 61404);
    }
    return false;
  }
  
  public void O(int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(8241102716928L, 61401);
    GMTrace.o(8241102716928L, 61401);
  }
  
  public final void a(s params)
  {
    GMTrace.i(8239760539648L, 61391);
    s locals = this.pGS;
    if (locals == params)
    {
      GMTrace.o(8239760539648L, 61391);
      return;
    }
    if ((locals != null) && (locals.equals(params)))
    {
      GMTrace.o(8239760539648L, 61391);
      return;
    }
    this.pGS = params;
    bkI();
    bkz();
    GMTrace.o(8239760539648L, 61391);
  }
  
  protected int aXW()
  {
    GMTrace.i(8240565846016L, 61397);
    GMTrace.o(8240565846016L, 61397);
    return Integer.MAX_VALUE;
  }
  
  public View bkC()
  {
    GMTrace.i(8240297410560L, 61395);
    View localView = this.hqF;
    GMTrace.o(8240297410560L, 61395);
    return localView;
  }
  
  protected void bkI()
  {
    GMTrace.i(8240431628288L, 61396);
    w.w("MicroMsg.Sns.AdLandingPageBaseComponent", "for component reuse, subclass must implement this method");
    GMTrace.o(8240431628288L, 61396);
  }
  
  protected View bkJ()
  {
    GMTrace.i(8240700063744L, 61398);
    GMTrace.o(8240700063744L, 61398);
    return null;
  }
  
  public final s bkM()
  {
    GMTrace.i(15402021158912L, 114754);
    s locals = this.pGS;
    GMTrace.o(15402021158912L, 114754);
    return locals;
  }
  
  public final String bkN()
  {
    GMTrace.i(18578820562944L, 138423);
    String str = this.pGS.pEz;
    GMTrace.o(18578820562944L, 138423);
    return str;
  }
  
  public void bkO()
  {
    GMTrace.i(20065416118272L, 149499);
    GMTrace.o(20065416118272L, 149499);
  }
  
  public void bkl()
  {
    GMTrace.i(8241236934656L, 61402);
    bkn();
    GMTrace.o(8241236934656L, 61402);
  }
  
  public void bkm()
  {
    GMTrace.i(8240834281472L, 61399);
    if (this.pGV)
    {
      GMTrace.o(8240834281472L, 61399);
      return;
    }
    this.pGV = true;
    this.pGU = System.currentTimeMillis();
    this.pGT += 1;
    GMTrace.o(8240834281472L, 61399);
  }
  
  public void bkn()
  {
    GMTrace.i(8240968499200L, 61400);
    if (!this.pGV)
    {
      GMTrace.o(8240968499200L, 61400);
      return;
    }
    this.pGV = false;
    if (this.pGU > 0L) {
      this.iyB += System.currentTimeMillis() - this.pGU;
    }
    this.pGU = 0L;
    GMTrace.o(8240968499200L, 61400);
  }
  
  public void bkq()
  {
    GMTrace.i(17128329576448L, 127616);
    GMTrace.o(17128329576448L, 127616);
  }
  
  protected void bkz()
  {
    GMTrace.i(8241639587840L, 61405);
    hV(false);
    GMTrace.o(8241639587840L, 61405);
  }
  
  public final View getView()
  {
    GMTrace.i(8240028975104L, 61393);
    if (this.hqF != null)
    {
      localObject = this.hqF;
      GMTrace.o(8240028975104L, 61393);
      return (View)localObject;
    }
    if (this.hqF == null)
    {
      int i = aXW();
      if (i != Integer.MAX_VALUE) {
        this.hqF = ((LayoutInflater)this.context.getSystemService("layout_inflater")).inflate(i, this.pGW, false);
      }
      while (this.hqF == null)
      {
        throw new IllegalStateException("implement getLayout() or customLayout() to get a valid root view");
        this.hqF = bkJ();
        if ((this.hqF != null) && (this.hqF.getLayoutParams() == null))
        {
          this.pGW.addView(this.hqF);
          localObject = this.hqF.getLayoutParams();
          this.pGW.removeView(this.hqF);
          this.hqF.setLayoutParams((ViewGroup.LayoutParams)localObject);
        }
      }
    }
    bkC();
    bkq();
    bkI();
    bkz();
    Object localObject = this.hqF;
    GMTrace.o(8240028975104L, 61393);
    return (View)localObject;
  }
  
  protected final void hV(boolean paramBoolean)
  {
    GMTrace.i(8241773805568L, 61406);
    if (this.hqF == null) {
      throw new IllegalStateException("set field contentView first");
    }
    if (this.pGS != null)
    {
      ViewGroup.LayoutParams localLayoutParams = this.hqF.getLayoutParams();
      if (localLayoutParams != null)
      {
        if (this.pGS.pEF != 2.14748365E9F) {
          localLayoutParams.width = ((int)this.pGS.pEF);
        }
        if (this.pGS.pEG != 2.14748365E9F) {
          localLayoutParams.height = ((int)this.pGS.pEG);
        }
        if ((paramBoolean) && ((localLayoutParams instanceof ViewGroup.MarginLayoutParams))) {
          ((ViewGroup.MarginLayoutParams)localLayoutParams).setMargins((int)this.pGS.pED, (int)this.pGS.pEB, (int)this.pGS.pEE, (int)this.pGS.pEC);
        }
        Object localObject;
        int i;
        if ((localLayoutParams instanceof LinearLayout.LayoutParams))
        {
          localObject = (LinearLayout.LayoutParams)localLayoutParams;
          i = getGravity();
          if (i != 0) {
            ((LinearLayout.LayoutParams)localObject).gravity = i;
          }
        }
        for (;;)
        {
          this.hqF.setLayoutParams(localLayoutParams);
          GMTrace.o(8241773805568L, 61406);
          return;
          ((LinearLayout.LayoutParams)localObject).gravity = -1;
          continue;
          if ((localLayoutParams instanceof FrameLayout.LayoutParams))
          {
            localObject = (FrameLayout.LayoutParams)localLayoutParams;
            i = getGravity();
            if (i != 0) {
              ((FrameLayout.LayoutParams)localObject).gravity = i;
            } else {
              ((FrameLayout.LayoutParams)localObject).gravity = -1;
            }
          }
        }
      }
      w.i("MicroMsg.Sns.AdLandingPageBaseComponent", this + " has no layoutParams in container " + this.pGW);
    }
    GMTrace.o(8241773805568L, 61406);
  }
  
  public boolean q(JSONArray paramJSONArray)
  {
    GMTrace.i(8241371152384L, 61403);
    GMTrace.o(8241371152384L, 61403);
    return false;
  }
  
  public final void setBackgroundColor(int paramInt)
  {
    GMTrace.i(8239894757376L, 61392);
    this.backgroundColor = paramInt;
    GMTrace.o(8239894757376L, 61392);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\AdLandingPagesStorage\AdLandingPageComponent\component\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */