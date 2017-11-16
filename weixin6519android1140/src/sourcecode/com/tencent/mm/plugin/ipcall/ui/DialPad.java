package com.tencent.mm.plugin.ipcall.ui;

import android.content.Context;
import android.content.res.Resources;
import android.media.AudioManager;
import android.media.ToneGenerator;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.compatible.b.e;
import com.tencent.mm.plugin.ipcall.a.i;
import com.tencent.mm.plugin.voip.video.d;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DialPad
  extends RelativeLayout
  implements View.OnClickListener, View.OnLongClickListener
{
  private static final String[] mne;
  private static final String[] mnf;
  boolean mnd;
  Map<Integer, DialNumberButton> mng;
  private Map<String, DialNumberButton> mnh;
  Map<Integer, View> mni;
  a mnj;
  
  static
  {
    GMTrace.i(11642045726720L, 86740);
    mne = new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "*", "0", "#" };
    mnf = new String[] { "", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ", "", "+", "" };
    GMTrace.o(11642045726720L, 86740);
  }
  
  public DialPad(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(11641106202624L, 86733);
    this.mnd = false;
    this.mng = new HashMap();
    this.mnh = new HashMap();
    this.mni = new HashMap();
    init();
    GMTrace.o(11641106202624L, 86733);
  }
  
  private void a(int paramInt, String paramString1, String paramString2, float paramFloat)
  {
    GMTrace.i(11641374638080L, 86735);
    DialNumberButton localDialNumberButton = (DialNumberButton)findViewById(paramInt);
    if ((!bg.nm(paramString1)) && (paramString1.length() == 1)) {
      localDialNumberButton.mnb.setText(paramString1);
    }
    if ((bg.nm(paramString2)) && (!"1".equals(paramString1))) {
      localDialNumberButton.mnc.setVisibility(8);
    }
    for (;;)
    {
      localDialNumberButton.mnb.setTextSize(0, paramFloat);
      localDialNumberButton.setOnClickListener(this);
      localDialNumberButton.setOnLongClickListener(this);
      localDialNumberButton.ft(this.mnd);
      this.mng.put(Integer.valueOf(paramInt), localDialNumberButton);
      this.mnh.put(paramString1, localDialNumberButton);
      GMTrace.o(11641374638080L, 86735);
      return;
      localDialNumberButton.mnc.setText(paramString2);
      localDialNumberButton.mnc.setVisibility(0);
    }
  }
  
  private void init()
  {
    GMTrace.i(11641240420352L, 86734);
    LayoutInflater.from(getContext()).inflate(R.i.buk, this);
    float f1 = getContext().getResources().getDimensionPixelSize(R.f.aSs);
    float f2 = getContext().getResources().getDimensionPixelSize(R.f.aSu);
    float f3 = getContext().getResources().getDimensionPixelSize(R.f.aSt);
    a(R.h.bub, mne[0], mnf[0], f1);
    a(R.h.bui, mne[1], mnf[1], f1);
    a(R.h.buh, mne[2], mnf[2], f1);
    a(R.h.btZ, mne[3], mnf[3], f1);
    a(R.h.btY, mne[4], mnf[4], f1);
    a(R.h.bue, mne[5], mnf[5], f1);
    a(R.h.buc, mne[6], mnf[6], f1);
    a(R.h.btX, mne[7], mnf[7], f1);
    a(R.h.bua, mne[8], mnf[8], f1);
    a(R.h.bug, mne[9], mnf[9], f3);
    a(R.h.buj, mne[10], mnf[10], f1);
    a(R.h.bud, mne[11], mnf[11], f2);
    this.mni.put(Integer.valueOf(R.h.buI), findViewById(R.h.buI));
    this.mni.put(Integer.valueOf(R.h.buK), findViewById(R.h.buK));
    this.mni.put(Integer.valueOf(R.h.buJ), findViewById(R.h.buJ));
    this.mni.put(Integer.valueOf(R.h.buG), findViewById(R.h.buG));
    this.mni.put(Integer.valueOf(R.h.buF), findViewById(R.h.buF));
    Iterator localIterator = this.mni.values().iterator();
    while (localIterator.hasNext())
    {
      View localView = (View)localIterator.next();
      if (this.mnd) {
        localView.setBackgroundDrawable(getResources().getDrawable(R.e.aPf));
      } else {
        localView.setBackgroundDrawable(getResources().getDrawable(R.e.aNv));
      }
    }
    setClipToPadding(false);
    setClipChildren(false);
    GMTrace.o(11641240420352L, 86734);
  }
  
  public void onClick(View arg1)
  {
    GMTrace.i(11641508855808L, 86736);
    String str1;
    String str2;
    d locald;
    int i;
    Object localObject2;
    if (this.mng.containsKey(Integer.valueOf(???.getId())))
    {
      ??? = (DialNumberButton)this.mng.get(Integer.valueOf(???.getId()));
      str1 = ???.aJa();
      str2 = ???.aJb();
      locald = i.aIz();
      i = d.JT(str1);
      if ((i != -1) && (d.bvX()))
      {
        localObject2 = at.AS().fMS;
        ??? = (View)localObject2;
        if (localObject2 == null) {
          ??? = (AudioManager)d.mContext.getSystemService("audio");
        }
        int j = ???.getRingerMode();
        if ((j != 0) && (j != 1)) {
          break label167;
        }
      }
      if (this.mnj != null)
      {
        localObject2 = this.mnj;
        if (bg.nm(str1)) {
          break label213;
        }
      }
    }
    label167:
    label213:
    for (??? = str1;; ??? = str2)
    {
      ((a)localObject2).Ap(???);
      GMTrace.o(11641508855808L, 86736);
      return;
      synchronized (locald.qOy)
      {
        if (locald.qOz != null) {}
      }
      locald.qOz.startTone(i, 250);
      break;
    }
  }
  
  public boolean onLongClick(View paramView)
  {
    GMTrace.i(11641643073536L, 86737);
    if (this.mng.containsKey(Integer.valueOf(paramView.getId())))
    {
      paramView = (DialNumberButton)this.mng.get(Integer.valueOf(paramView.getId()));
      String str = paramView.aJa();
      paramView = paramView.aJb();
      if (this.mnj != null)
      {
        a locala = this.mnj;
        if (!bg.nm(str)) {
          paramView = str;
        }
        locala.Aq(paramView);
      }
      GMTrace.o(11641643073536L, 86737);
      return true;
    }
    GMTrace.o(11641643073536L, 86737);
    return false;
  }
  
  public void onViewAdded(View paramView)
  {
    GMTrace.i(11641777291264L, 86738);
    w.i("MicroMsg.DialPad", "onViewAdded, class: %s", new Object[] { paramView.getClass().getSimpleName() });
    GMTrace.o(11641777291264L, 86738);
  }
  
  public void onViewRemoved(View paramView)
  {
    GMTrace.i(11641911508992L, 86739);
    w.i("MicroMsg.DialPad", "onViewRemoved, class: %s", new Object[] { paramView.getClass().getSimpleName() });
    GMTrace.o(11641911508992L, 86739);
  }
  
  public static abstract interface a
  {
    public abstract void Ap(String paramString);
    
    public abstract void Aq(String paramString);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\ui\DialPad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */