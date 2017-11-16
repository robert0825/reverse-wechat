package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.k;
import com.tencent.mm.au.a.b;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.widget.e;
import java.util.LinkedList;

final class bx
  implements ca.a
{
  bx()
  {
    GMTrace.i(2513361174528L, 18726);
    GMTrace.o(2513361174528L, 18726);
  }
  
  public final void a(ah.a parama, final int paramInt, final En_5b8fbb1e.a parama1, final au paramau)
  {
    GMTrace.i(2513495392256L, 18727);
    final ca.b localb = (ca.b)parama;
    int i = localb.wxX.getContext().getResources().getColor(R.e.aOm);
    int j = localb.wxX.getContext().getResources().getColor(R.e.aOn);
    final com.tencent.mm.au.a locala = paramau.bTZ();
    if (locala == null) {
      localb.lFh.setVisibility(8);
    }
    for (;;)
    {
      localb.wxX.invalidate();
      GMTrace.o(2513495392256L, 18727);
      return;
      localb.lFh.setVisibility(0);
      localb.wxX.setText(h.b(localb.wxX.getContext(), bg.nl(locala.gOS), localb.wxX.getTextSize()));
      localb.wxX.setMovementMethod(new a());
      Object localObject;
      int k;
      if ((locala.TYPE.equalsIgnoreCase("NewXmlChatRoomAccessVerifyApplication")) || (locala.TYPE.equalsIgnoreCase("NewXmlChatRoomAccessVerifyApproval")))
      {
        i = localb.wxX.getContext().getResources().getColor(R.e.aNQ);
        j = localb.wxX.getContext().getResources().getColor(R.e.aMY);
        if (!paramau.bTV())
        {
          parama = Spannable.Factory.getInstance().newSpannable("    " + localb.wxX.getText());
          localObject = localb.wxX.getContext().getResources().getDrawable(R.k.cMQ);
          ((Drawable)localObject).setBounds(0, 0, ((Drawable)localObject).getIntrinsicWidth(), ((Drawable)localObject).getIntrinsicHeight());
          e locale = new e((Drawable)localObject);
          locale.xpz = ((int)((((Drawable)localObject).getIntrinsicHeight() - localb.wxX.getTextSize() + com.tencent.mm.br.a.fromDPToPix(localb.wxX.getContext(), 2)) / 2.0F));
          parama.setSpan(locale, 0, 3, 33);
          k = 4;
        }
      }
      for (;;)
      {
        final int m = 0;
        while (m < locala.gOU.size())
        {
          localObject = new b();
          ((b)localObject).wxD = new c(i, j)
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(2387464945664L, 17788);
              w.i("MicroMsg.ChattingItemNewXmlSysImpl", "[onClick] pBaseNewXmlMsg:%s", new Object[] { locala });
              parama1.a(localb.lFh, paramau, locala, m);
              GMTrace.o(2387464945664L, 17788);
            }
          };
          ((b)localObject).start = ((Integer)locala.gOV.get(m)).intValue();
          ((b)localObject).end = ((Integer)locala.gOW.get(m)).intValue();
          parama.setSpan(((b)localObject).wxD, ((b)localObject).start + k, ((b)localObject).end + k, 33);
          m += 1;
        }
        i = localb.wxX.getContext().getResources().getColor(R.e.aNQ);
        j = localb.wxX.getContext().getResources().getColor(R.e.aMY);
        parama = Spannable.Factory.getInstance().newSpannable(localb.wxX.getText());
        k = 0;
        continue;
        parama = Spannable.Factory.getInstance().newSpannable(localb.wxX.getText());
        k = 0;
      }
      localb.wxX.setText(parama);
      localb.wxX.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(2520877367296L, 18782);
          w.d("MicroMsg.ChattingItemNewXmlSysImpl", "clicked");
          GMTrace.o(2520877367296L, 18782);
        }
      });
    }
  }
  
  static final class a
    extends LinkMovementMethod
  {
    private bx.c wxC;
    
    a()
    {
      GMTrace.i(2297539067904L, 17118);
      GMTrace.o(2297539067904L, 17118);
    }
    
    private static bx.c a(TextView paramTextView, Spannable paramSpannable, MotionEvent paramMotionEvent)
    {
      GMTrace.i(2297807503360L, 17120);
      int i = (int)paramMotionEvent.getX();
      int j = (int)paramMotionEvent.getY();
      int k = paramTextView.getTotalPaddingLeft();
      int m = paramTextView.getTotalPaddingTop();
      int n = paramTextView.getScrollX();
      int i1 = paramTextView.getScrollY();
      paramTextView = paramTextView.getLayout();
      i = paramTextView.getOffsetForHorizontal(paramTextView.getLineForVertical(j - m + i1), i - k + n);
      paramTextView = (bx.c[])paramSpannable.getSpans(i, i, bx.c.class);
      if (paramTextView.length > 0) {}
      for (paramTextView = paramTextView[0];; paramTextView = null)
      {
        GMTrace.o(2297807503360L, 17120);
        return paramTextView;
      }
    }
    
    public final boolean onTouchEvent(TextView paramTextView, Spannable paramSpannable, MotionEvent paramMotionEvent)
    {
      GMTrace.i(2297673285632L, 17119);
      if (paramMotionEvent.getAction() == 0)
      {
        this.wxC = a(paramTextView, paramSpannable, paramMotionEvent);
        if (this.wxC != null)
        {
          this.wxC.wxE = true;
          Selection.setSelection(paramSpannable, paramSpannable.getSpanStart(this.wxC), paramSpannable.getSpanEnd(this.wxC));
        }
      }
      for (;;)
      {
        GMTrace.o(2297673285632L, 17119);
        return true;
        if (paramMotionEvent.getAction() == 2)
        {
          paramTextView = a(paramTextView, paramSpannable, paramMotionEvent);
          if ((this.wxC != null) && (paramTextView != this.wxC))
          {
            this.wxC.wxE = false;
            this.wxC = null;
            Selection.removeSelection(paramSpannable);
          }
        }
        else
        {
          if (this.wxC != null)
          {
            this.wxC.wxE = false;
            super.onTouchEvent(paramTextView, paramSpannable, paramMotionEvent);
          }
          this.wxC = null;
          Selection.removeSelection(paramSpannable);
        }
      }
    }
  }
  
  static final class b
  {
    public int end;
    public int start;
    public ClickableSpan wxD;
    
    b()
    {
      GMTrace.i(2218350608384L, 16528);
      GMTrace.o(2218350608384L, 16528);
    }
  }
  
  static abstract class c
    extends ClickableSpan
  {
    boolean wxE;
    private int wxF;
    private int wxG;
    
    public c(int paramInt1, int paramInt2)
    {
      GMTrace.i(2255797354496L, 16807);
      this.wxF = paramInt1;
      this.wxG = paramInt2;
      GMTrace.o(2255797354496L, 16807);
    }
    
    public void updateDrawState(TextPaint paramTextPaint)
    {
      GMTrace.i(2255931572224L, 16808);
      super.updateDrawState(paramTextPaint);
      if (this.wxE) {}
      for (int i = this.wxG;; i = this.wxF)
      {
        paramTextPaint.setColor(i);
        paramTextPaint.setUnderlineText(false);
        GMTrace.o(2255931572224L, 16808);
        return;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\bx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */