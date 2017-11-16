package com.tencent.mm.plugin.wenote.ui.nativenote.b;

import android.text.Editable;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.plugin.wenote.model.a.b;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.c;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.e;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.u;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;

public final class k
  extends a
{
  public WXRTEditText sjR;
  
  public k(View paramView, com.tencent.mm.plugin.wenote.model.nativenote.manager.k paramk)
  {
    super(paramView, paramk);
    GMTrace.i(17157320605696L, 127832);
    this.sjR = ((WXRTEditText)paramView.findViewById(R.h.bZm));
    if ((paramk.sfG != 2) || (!this.shJ.sfH))
    {
      this.sjR.setKeyListener(null);
      this.sjR.setFocusable(false);
      this.sjR.setClickable(true);
    }
    this.sjR.seO = this;
    this.sjR.seM = 0;
    this.shJ.o(this.sjR);
    this.sjR.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener()
    {
      public final void onGlobalLayout()
      {
        GMTrace.i(17158260129792L, 127839);
        at.xB().A(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(17157186387968L, 127831);
            k.this.sjR.hasFocus();
            GMTrace.o(17157186387968L, 127831);
          }
        });
        GMTrace.o(17158260129792L, 127839);
      }
    });
    GMTrace.o(17157320605696L, 127832);
  }
  
  public final void a(final b paramb, int paramInt1, int paramInt2)
  {
    GMTrace.i(17157454823424L, 127833);
    this.sjR.seZ = paramInt1;
    paramb = (com.tencent.mm.plugin.wenote.model.a.h)paramb;
    paramb.scM = this.sjR;
    paramb.scK = null;
    paramb.scL = null;
    Object localObject = c.bHo().yD(paramInt1 - 1);
    if ((localObject != null) && (((b)localObject).getType() == 1))
    {
      localObject = (LinearLayout.LayoutParams)this.sjR.getLayoutParams();
      ((LinearLayout.LayoutParams)localObject).topMargin = 0;
      this.sjR.setLayoutParams((ViewGroup.LayoutParams)localObject);
    }
    localObject = c.bHo().yD(paramInt1 + 1);
    if ((localObject != null) && (((b)localObject).getType() == 1))
    {
      localObject = (LinearLayout.LayoutParams)this.sjR.getLayoutParams();
      ((LinearLayout.LayoutParams)localObject).bottomMargin = 0;
      this.sjR.setLayoutParams((ViewGroup.LayoutParams)localObject);
    }
    if ((this.shJ.sfG != 2) || (!this.shJ.sfH))
    {
      this.sjR.NJ(paramb.content);
      com.tencent.mm.pluginsdk.ui.d.h.i(this.sjR);
    }
    for (;;)
    {
      w.i("MicroMsg.NoteTextItemHolder", "TextItemHolder position is " + gb());
      GMTrace.o(17157454823424L, 127833);
      return;
      af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(17156917952512L, 127829);
          k.this.sjR.NJ(paramb.content);
          k.this.sjR.bHN();
          k.this.sjR.bHP();
          com.tencent.mm.pluginsdk.ui.d.h.i(k.this.sjR);
          k.this.sjR.bHQ();
          k.this.sjR.bHO();
          if (paramb.scH) {
            if ((paramb.scJ != -1) && (paramb.scJ < k.this.sjR.getText().toString().length()))
            {
              k.this.sjR.setSelection(paramb.scJ);
              k.this.sjR.requestFocus();
              af.i(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(20584570290176L, 153367);
                  if (k.2.this.sjU.scQ != 0)
                  {
                    int i = k.this.sjR.bHL().Vw;
                    if (i == k.2.this.sjU.content.length())
                    {
                      k.this.sjR.bHN();
                      k.this.sjR.getText().append("\n");
                      k.this.sjR.bHO();
                      k.this.sjR.setSelection(i);
                    }
                    k.2.this.sjU.scQ = 0;
                    if (k.2.this.sjU.scR == 1)
                    {
                      k.this.sjR.a(u.shB, Boolean.valueOf(true));
                      GMTrace.o(20584570290176L, 153367);
                      return;
                    }
                    if (k.2.this.sjU.scR == 3)
                    {
                      k.this.sjR.a(u.shA, Boolean.valueOf(true));
                      GMTrace.o(20584570290176L, 153367);
                      return;
                    }
                    if (k.2.this.sjU.scR == 2) {
                      k.this.sjR.a(u.shC, Boolean.valueOf(true));
                    }
                  }
                  GMTrace.o(20584570290176L, 153367);
                }
              }, 500L);
            }
          }
          for (;;)
          {
            if (paramb.scP)
            {
              paramb.scP = false;
              k.this.sjR.scP = true;
              k.this.sjR.onTextContextMenuItem(16908322);
            }
            GMTrace.o(17156917952512L, 127829);
            return;
            k.this.sjR.setSelection(k.this.sjR.getText().toString().length());
            break;
            if (k.this.sjR.hasFocus()) {
              k.this.sjR.clearFocus();
            }
          }
        }
      });
    }
  }
  
  public final int bIG()
  {
    GMTrace.i(17157589041152L, 127834);
    GMTrace.o(17157589041152L, 127834);
    return 1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\ui\nativenote\b\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */