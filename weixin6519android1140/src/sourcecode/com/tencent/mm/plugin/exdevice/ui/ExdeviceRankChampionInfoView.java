package com.tencent.mm.plugin.exdevice.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.r;

public class ExdeviceRankChampionInfoView
  extends LinearLayout
{
  private TextPaint fB;
  private int gbS;
  private String iAx;
  private TextView jHc;
  private ImageView kEk;
  
  public ExdeviceRankChampionInfoView(final Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(11092289912832L, 82644);
    this.gbS = 0;
    paramAttributeSet = LayoutInflater.from(paramContext).inflate(R.i.cvV, this, true);
    this.fB = new TextPaint(1);
    this.jHc = ((TextView)paramAttributeSet.findViewById(R.h.chH));
    this.kEk = ((ImageView)paramAttributeSet.findViewById(R.h.bfl));
    this.kEk.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(11018201726976L, 82092);
        if (bg.nm(ExdeviceRankChampionInfoView.a(ExdeviceRankChampionInfoView.this)))
        {
          w.w("MicroMsg.ExdeviceRankChampionInfoView", "username is null.");
          GMTrace.o(11018201726976L, 82092);
          return;
        }
        paramAnonymousView = new Intent(paramContext, ExdeviceProfileUI.class);
        paramAnonymousView.putExtra("username", ExdeviceRankChampionInfoView.a(ExdeviceRankChampionInfoView.this));
        paramContext.startActivity(paramAnonymousView);
        GMTrace.o(11018201726976L, 82092);
      }
    });
    this.jHc.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(11090813517824L, 82633);
        if (bg.nm(ExdeviceRankChampionInfoView.a(ExdeviceRankChampionInfoView.this)))
        {
          w.w("MicroMsg.ExdeviceRankChampionInfoView", "username is null.");
          GMTrace.o(11090813517824L, 82633);
          return;
        }
        paramAnonymousView = new Intent(paramContext, ExdeviceProfileUI.class);
        paramAnonymousView.putExtra("username", ExdeviceRankChampionInfoView.a(ExdeviceRankChampionInfoView.this));
        paramContext.startActivity(paramAnonymousView);
        GMTrace.o(11090813517824L, 82633);
      }
    });
    try
    {
      this.gbS = paramContext.getResources().getDimensionPixelSize(R.f.aQb);
    }
    catch (Exception paramContext)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.ExdeviceRankChampionInfoView", paramContext, "", new Object[0]);
        if (this.gbS <= 0) {
          this.gbS = 128;
        }
      }
    }
    finally
    {
      if (this.gbS > 0) {
        break label207;
      }
      this.gbS = 128;
    }
    w.d("MicroMsg.ExdeviceRankChampionInfoView", "ap: ellipsizewidth: %d", new Object[] { Integer.valueOf(this.gbS) });
    GMTrace.o(11092289912832L, 82644);
  }
  
  public void setAlpha(float paramFloat)
  {
    GMTrace.i(11092155695104L, 82643);
    this.jHc.setAlpha(paramFloat);
    this.kEk.setAlpha(paramFloat);
    GMTrace.o(11092155695104L, 82643);
  }
  
  public final void xd(String paramString)
  {
    GMTrace.i(11092424130560L, 82645);
    this.iAx = paramString;
    if (this.jHc != null)
    {
      if (bg.nm(paramString)) {
        break label180;
      }
      this.jHc.setVisibility(0);
      Object localObject = getContext();
      int i = R.l.dqR;
      String str = this.iAx;
      int j = this.gbS;
      localObject = ((Context)localObject).getString(i, new Object[] { TextUtils.ellipsize(h.a(getContext(), r.fs(str)), this.fB, j, TextUtils.TruncateAt.END) });
      w.d("MicroMsg.ExdeviceRankChampionInfoView", "title : %s", new Object[] { h.a(getContext(), (CharSequence)localObject) });
      this.jHc.setText(h.b(getContext(), (CharSequence)localObject, this.jHc.getTextSize()));
    }
    while (this.kEk != null) {
      if (!bg.nm(paramString))
      {
        a.b.n(this.kEk, paramString);
        this.kEk.setVisibility(0);
        GMTrace.o(11092424130560L, 82645);
        return;
        label180:
        this.jHc.setVisibility(8);
        this.jHc.setText("");
      }
      else
      {
        this.kEk.setVisibility(4);
      }
    }
    GMTrace.o(11092424130560L, 82645);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\ui\ExdeviceRankChampionInfoView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */