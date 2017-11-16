package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.text.ClipboardManager;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.widget.MMEditText;

public class SnsEditText
  extends MMEditText
{
  private Context context;
  private boolean mxg;
  private int qaA;
  private ClipboardManager qaw;
  int qax;
  private int qay;
  private int qaz;
  private float y;
  
  public SnsEditText(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8566983360512L, 63829);
    this.qaw = null;
    this.qax = 0;
    this.qay = 0;
    this.qaz = 0;
    this.mxg = false;
    this.qaA = 10;
    this.context = paramContext;
    this.qaw = ((ClipboardManager)this.context.getSystemService("clipboard"));
    addTextChangedListener(new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        GMTrace.i(8635702837248L, 64341);
        GMTrace.o(8635702837248L, 64341);
      }
      
      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(8635568619520L, 64340);
        if (paramAnonymousCharSequence != null) {
          SnsEditText.c(SnsEditText.this, paramAnonymousCharSequence.length());
        }
        GMTrace.o(8635568619520L, 64340);
      }
      
      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(8635434401792L, 64339);
        SnsEditText.a(SnsEditText.this, paramAnonymousCharSequence.length());
        if (paramAnonymousInt2 > 0)
        {
          GMTrace.o(8635434401792L, 64339);
          return;
        }
        for (;;)
        {
          try
          {
            if ((SnsEditText.a(SnsEditText.this) > SnsEditText.b(SnsEditText.this)) && (paramAnonymousInt3 > 30))
            {
              paramAnonymousCharSequence = paramAnonymousCharSequence.toString().substring(paramAnonymousInt1, paramAnonymousInt1 + paramAnonymousInt3);
              if ((paramAnonymousCharSequence.indexOf("\n") >= 0) && (paramAnonymousInt3 > 30))
              {
                SnsEditText.b(SnsEditText.this, SnsEditText.c(SnsEditText.this) + paramAnonymousCharSequence.length());
                w.d("MicroMsg.SnsEditText", "parsterLen: %d %d", new Object[] { Integer.valueOf(paramAnonymousCharSequence.length()), Integer.valueOf(SnsEditText.c(SnsEditText.this)) });
              }
            }
            else
            {
              GMTrace.o(8635434401792L, 64339);
              return;
            }
          }
          catch (Exception paramAnonymousCharSequence)
          {
            w.printErrStackTrace("MicroMsg.SnsEditText", paramAnonymousCharSequence, "", new Object[0]);
            GMTrace.o(8635434401792L, 64339);
            return;
          }
          if (paramAnonymousInt3 <= 100) {}
        }
      }
    });
    GMTrace.o(8566983360512L, 63829);
  }
  
  public final int boQ()
  {
    GMTrace.i(8567117578240L, 63830);
    int i = this.qax;
    GMTrace.o(8567117578240L, 63830);
    return i;
  }
  
  public boolean onTextContextMenuItem(int paramInt)
  {
    GMTrace.i(8567251795968L, 63831);
    boolean bool = super.onTextContextMenuItem(paramInt);
    GMTrace.o(8567251795968L, 63831);
    return bool;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(8567386013696L, 63832);
    if (paramMotionEvent.getAction() == 2) {
      if (Math.abs(this.y - paramMotionEvent.getY()) > this.qaA) {
        this.mxg = true;
      }
    }
    for (;;)
    {
      this.y = paramMotionEvent.getY();
      boolean bool = super.onTouchEvent(paramMotionEvent);
      GMTrace.o(8567386013696L, 63832);
      return bool;
      if (paramMotionEvent.getAction() == 1)
      {
        if (this.mxg)
        {
          this.mxg = false;
          GMTrace.o(8567386013696L, 63832);
          return true;
        }
      }
      else {
        this.mxg = false;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\SnsEditText.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */