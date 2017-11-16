package com.tencent.mm.plugin.appbrand.widget.input;

import android.text.Spanned;
import android.widget.EditText;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.tools.a.c;
import com.tencent.mm.ui.tools.a.c.a;
import com.tencent.mm.ui.tools.h;
import java.lang.ref.WeakReference;

final class n
  extends c
{
  private n(WeakReference<EditText> paramWeakReference)
  {
    super(paramWeakReference);
    GMTrace.i(10047539118080L, 74860);
    GMTrace.o(10047539118080L, 74860);
  }
  
  public static n a(EditText paramEditText)
  {
    GMTrace.i(10047673335808L, 74861);
    paramEditText = new n(new WeakReference(paramEditText));
    GMTrace.o(10047673335808L, 74861);
    return paramEditText;
  }
  
  protected final h bD(int paramInt1, int paramInt2)
  {
    GMTrace.i(10047807553536L, 74862);
    b localb = new b(paramInt1, paramInt2);
    GMTrace.o(10047807553536L, 74862);
    return localb;
  }
  
  static abstract class a
    implements c.a
  {
    a()
    {
      GMTrace.i(10072235180032L, 75044);
      GMTrace.o(10072235180032L, 75044);
    }
    
    public final void acJ()
    {
      GMTrace.i(10072503615488L, 75046);
      GMTrace.o(10072503615488L, 75046);
    }
    
    public void ack()
    {
      GMTrace.i(10072637833216L, 75047);
      GMTrace.o(10072637833216L, 75047);
    }
    
    public final void sT(String paramString)
    {
      GMTrace.i(10072369397760L, 75045);
      GMTrace.o(10072369397760L, 75045);
    }
  }
  
  private final class b
    extends h
  {
    private final int iMy;
    private final int iMz;
    
    b(int paramInt1, int paramInt2)
    {
      super(paramInt2);
      GMTrace.i(10078677630976L, 75092);
      this.iMy = paramInt1;
      this.iMz = paramInt2;
      GMTrace.o(10078677630976L, 75092);
    }
    
    public final CharSequence filter(CharSequence paramCharSequence, int paramInt1, int paramInt2, Spanned paramSpanned, int paramInt3, int paramInt4)
    {
      int i = 0;
      GMTrace.i(10078811848704L, 75093);
      if (de(paramSpanned.subSequence(0, paramInt3).toString() + paramSpanned.subSequence(paramInt4, paramSpanned.length()).toString(), this.iMz) + de(paramCharSequence.subSequence(paramInt1, paramInt2).toString(), this.iMz) > this.iMy) {
        i = 1;
      }
      if (i == 0) {
        if ((i != 0) && (bg.L(paramCharSequence))) {
          if (n.this.xkm != null) {
            break label213;
          }
        }
      }
      label213:
      for (paramSpanned = null;; paramSpanned = (EditText)n.this.xkm.get())
      {
        final c.a locala = n.this.xkq;
        if ((paramSpanned != null) && (locala != null)) {
          paramSpanned.post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(10048075988992L, 74864);
              locala.ack();
              GMTrace.o(10048075988992L, 74864);
            }
          });
        }
        GMTrace.o(10078811848704L, 75093);
        return paramCharSequence;
        paramCharSequence = paramCharSequence.subSequence(paramInt1, Math.max(paramInt1, Math.min(this.iMy - (paramSpanned.length() - (paramInt4 - paramInt3)), paramInt2)));
        break;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\input\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */