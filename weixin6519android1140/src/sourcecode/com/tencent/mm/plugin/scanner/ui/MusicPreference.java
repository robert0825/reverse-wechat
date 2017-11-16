package com.tencent.mm.plugin.scanner.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.ui.base.preference.Preference;

public class MusicPreference
  extends Preference
{
  public boolean jWb;
  private View mView;
  private View.OnClickListener oiK;
  public String osP;
  public String osQ;
  public String osR;
  public ImageButton ovV;
  public a ovW;
  
  public MusicPreference(Context paramContext)
  {
    this(paramContext, null);
    GMTrace.i(6100061519872L, 45449);
    GMTrace.o(6100061519872L, 45449);
  }
  
  public MusicPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(6100195737600L, 45450);
    GMTrace.o(6100195737600L, 45450);
  }
  
  public MusicPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(6100329955328L, 45451);
    this.mView = null;
    this.ovV = null;
    this.osP = "";
    this.osQ = "";
    this.osR = "";
    setLayoutResource(R.i.cCe);
    GMTrace.o(6100329955328L, 45451);
  }
  
  public final View getView(View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(6100464173056L, 45452);
    if (this.mView == null) {
      this.mView = onCreateView(paramViewGroup);
    }
    onBindView(this.mView);
    paramView = this.mView;
    GMTrace.o(6100464173056L, 45452);
    return paramView;
  }
  
  public final void ha(boolean paramBoolean)
  {
    GMTrace.i(6100598390784L, 45453);
    this.jWb = paramBoolean;
    if (this.ovV != null)
    {
      if (paramBoolean)
      {
        this.ovV.setImageResource(R.g.aYZ);
        GMTrace.o(6100598390784L, 45453);
        return;
      }
      this.ovV.setImageResource(R.g.aYY);
    }
    GMTrace.o(6100598390784L, 45453);
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(6100732608512L, 45454);
    super.onBindView(paramView);
    if (this.oiK == null) {
      this.oiK = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(6149319426048L, 45816);
          if (MusicPreference.this.ovW == null)
          {
            GMTrace.o(6149319426048L, 45816);
            return;
          }
          if (paramAnonymousView.getId() == R.h.bTK)
          {
            if (!MusicPreference.this.jWb) {
              break label93;
            }
            MusicPreference.this.jWb = false;
            MusicPreference.this.ovV.setImageResource(R.g.aYY);
          }
          for (;;)
          {
            MusicPreference.this.ovW.a(MusicPreference.this);
            GMTrace.o(6149319426048L, 45816);
            return;
            label93:
            MusicPreference.this.jWb = true;
            MusicPreference.this.ovV.setImageResource(R.g.aYZ);
          }
        }
      };
    }
    this.ovV = ((ImageButton)paramView.findViewById(R.h.bTK));
    this.ovV.setOnClickListener(this.oiK);
    if (this.jWb)
    {
      this.ovV.setImageResource(R.g.aYZ);
      GMTrace.o(6100732608512L, 45454);
      return;
    }
    this.ovV.setImageResource(R.g.aYY);
    GMTrace.o(6100732608512L, 45454);
  }
  
  public static abstract interface a
  {
    public abstract void a(MusicPreference paramMusicPreference);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\scanner\ui\MusicPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */