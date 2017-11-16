package com.tencent.mm.plugin.nearby.ui;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.bindmobile.BindMContactIntroUI;
import com.tencent.mm.y.a.c;
import com.tencent.mm.y.a.f;
import com.tencent.mm.y.a.g;

public class BindMobileOrQQHeaderView
  extends LinearLayout
{
  private ImageView iDp;
  private TextView ntC;
  private int ntD;
  private View.OnClickListener ntE;
  
  public BindMobileOrQQHeaderView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(6711691706368L, 50006);
    this.ntE = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6689948434432L, 49844);
        paramAnonymousView = new Intent();
        paramAnonymousView.setClass(BindMobileOrQQHeaderView.this.getContext(), BindMContactIntroUI.class);
        paramAnonymousView.putExtra("key_upload_scene", 7);
        MMWizardActivity.A(BindMobileOrQQHeaderView.this.getContext(), paramAnonymousView);
        if (g.BY().hb("3") != null)
        {
          g.BY().hb("3").result = "1";
          f.hg("3");
        }
        GMTrace.o(6689948434432L, 49844);
      }
    };
    this.ntD = a.ntH;
    cm(paramContext);
    GMTrace.o(6711691706368L, 50006);
  }
  
  public BindMobileOrQQHeaderView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(6711557488640L, 50005);
    this.ntE = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6689948434432L, 49844);
        paramAnonymousView = new Intent();
        paramAnonymousView.setClass(BindMobileOrQQHeaderView.this.getContext(), BindMContactIntroUI.class);
        paramAnonymousView.putExtra("key_upload_scene", 7);
        MMWizardActivity.A(BindMobileOrQQHeaderView.this.getContext(), paramAnonymousView);
        if (g.BY().hb("3") != null)
        {
          g.BY().hb("3").result = "1";
          f.hg("3");
        }
        GMTrace.o(6689948434432L, 49844);
      }
    };
    cm(paramContext);
    GMTrace.o(6711557488640L, 50005);
  }
  
  private void cm(Context paramContext)
  {
    GMTrace.i(6711825924096L, 50007);
    paramContext = View.inflate(paramContext, R.i.cCO, this);
    this.ntC = ((TextView)paramContext.findViewById(R.h.bPT));
    this.iDp = ((ImageView)paramContext.findViewById(R.h.bPB));
    switch (2.ntG[(this.ntD - 1)])
    {
    }
    for (;;)
    {
      GMTrace.o(6711825924096L, 50007);
      return;
      setOnClickListener(this.ntE);
      this.iDp.setImageResource(R.k.cPo);
      GMTrace.o(6711825924096L, 50007);
      return;
      setOnClickListener(this.ntE);
      this.iDp.setImageResource(R.k.cPp);
    }
  }
  
  public static enum a
  {
    static
    {
      GMTrace.i(6692498571264L, 49863);
      ntH = 1;
      ntI = 2;
      ntJ = new int[] { ntH, ntI };
      GMTrace.o(6692498571264L, 49863);
    }
    
    public static int[] aTJ()
    {
      GMTrace.i(6692364353536L, 49862);
      int[] arrayOfInt = (int[])ntJ.clone();
      GMTrace.o(6692364353536L, 49862);
      return arrayOfInt;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\nearby\ui\BindMobileOrQQHeaderView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */