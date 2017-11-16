package com.tencent.mm.plugin.game.gamewebview.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.v;

public final class e
  extends LinearLayout
{
  TextView kHZ;
  b lKt;
  ImageView lKu;
  ImageView lKv;
  public i lKw;
  private a lKx;
  public com.tencent.mm.ui.base.i lKy;
  private Context mContext;
  
  public e(b paramb)
  {
    super(paramb.getContext());
    GMTrace.i(17992960180224L, 134058);
    this.lKy = null;
    this.mContext = paramb.getContext();
    this.lKt = paramb;
    this.lKw = new g(paramb);
    paramb = this.mContext.getResources().getDisplayMetrics();
    if (paramb.widthPixels > paramb.heightPixels) {}
    for (int i = this.mContext.getResources().getDimensionPixelSize(R.f.aPM);; i = this.mContext.getResources().getDimensionPixelSize(R.f.aPN))
    {
      setLayoutParams(new LinearLayout.LayoutParams(-1, i));
      setBackgroundResource(R.e.aMB);
      paramb = v.fb(getContext()).inflate(R.i.czz, this, false);
      addView(paramb);
      this.lKu = ((ImageView)paramb.findViewById(R.h.bcI));
      this.lKu.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(17992020656128L, 134051);
          if (!e.this.aEv()) {
            e.this.lKt.aEf();
          }
          GMTrace.o(17992020656128L, 134051);
        }
      });
      this.kHZ = ((TextView)paramb.findViewById(R.h.title));
      this.lKv = ((ImageView)paramb.findViewById(R.h.bcJ));
      this.lKv.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(18015374540800L, 134225);
          e.a(e.this).aEG();
          GMTrace.o(18015374540800L, 134225);
        }
      });
      GMTrace.o(17992960180224L, 134058);
      return;
    }
  }
  
  public final void C(Bundle paramBundle)
  {
    GMTrace.i(17993362833408L, 134061);
    if (paramBundle == null) {}
    for (paramBundle = null;; paramBundle = new a(paramBundle))
    {
      this.lKx = paramBundle;
      GMTrace.o(17993362833408L, 134061);
      return;
    }
  }
  
  public final void aEG()
  {
    GMTrace.i(17993228615680L, 134060);
    if (this.lKw != null) {
      this.lKw.aEG();
    }
    GMTrace.o(17993228615680L, 134060);
  }
  
  public final boolean aEv()
  {
    GMTrace.i(17993497051136L, 134062);
    if (this.lKx != null)
    {
      Object localObject1 = this.lKx;
      if ((((a)localObject1).lIN) && (!bg.nm(((a)localObject1).aDX())) && (!bg.nm(((a)localObject1).aDY())) && (!bg.nm(((a)localObject1).aDZ()))) {}
      for (int i = 1; i != 0; i = 0)
      {
        Object localObject2 = this.lKx.aDX();
        localObject1 = this.lKx.aDY();
        String str = this.lKx.aDZ();
        w.i("MicroMsg.GameWebViewActionBar", "use js api close window confirm info : %s, %s, %s", new Object[] { localObject2, localObject1, str });
        View localView = View.inflate(getContext(), R.i.cBt, null);
        Object localObject3 = (CheckBox)localView.findViewById(R.h.bNh);
        ((CheckBox)localObject3).setChecked(false);
        ((CheckBox)localObject3).setVisibility(8);
        localObject3 = (TextView)localView.findViewById(R.h.bNj);
        ((TextView)localObject3).setText((CharSequence)localObject2);
        ((TextView)localObject3).setTextColor(getResources().getColor(R.e.aOE));
        localObject2 = (TextView)localView.findViewById(R.h.bNi);
        ((TextView)localObject2).setTextColor(getResources().getColor(R.e.aOE));
        ((TextView)localObject2).setVisibility(8);
        this.lKy = h.a(getContext(), true, "", localView, (String)localObject1, str, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(17991215349760L, 134045);
            e.b(e.this);
            e.this.lKt.aEf();
            GMTrace.o(17991215349760L, 134045);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(17994839228416L, 134072);
            e.b(e.this);
            GMTrace.o(17994839228416L, 134072);
          }
        });
        GMTrace.o(17993497051136L, 134062);
        return true;
      }
    }
    GMTrace.o(17993497051136L, 134062);
    return false;
  }
  
  public final void vl(String paramString)
  {
    GMTrace.i(17993094397952L, 134059);
    this.kHZ.setText(paramString);
    GMTrace.o(17993094397952L, 134059);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\ui\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */