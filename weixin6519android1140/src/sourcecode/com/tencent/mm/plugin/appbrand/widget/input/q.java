package com.tencent.mm.plugin.appbrand.widget.input;

import android.content.Context;
import android.text.InputFilter;
import android.text.InputFilter.AllCaps;
import android.text.method.NumberKeyListener;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.tencent.gmtrace.GMTrace;

final class q
  extends p
{
  public q(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(17277445472256L, 128727);
    super.setKeyListener(new NumberKeyListener()
    {
      protected final char[] getAcceptedChars()
      {
        GMTrace.i(17278384996352L, 128734);
        GMTrace.o(17278384996352L, 128734);
        return new char[] { 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 46, 88, 120 };
      }
      
      public final int getInputType()
      {
        GMTrace.i(17278519214080L, 128735);
        if (q.this.iNs) {}
        for (int i = 16;; i = 0)
        {
          GMTrace.o(17278519214080L, 128735);
          return i | 0x2;
        }
      }
    });
    GMTrace.o(17277445472256L, 128727);
  }
  
  public final void acN()
  {
    GMTrace.i(18287702310912L, 136254);
    ((t)t.bU(this)).setInputEditText(this);
    ad.b.c(this);
    GMTrace.o(18287702310912L, 136254);
  }
  
  public final View acl()
  {
    GMTrace.i(18287568093184L, 136253);
    t localt = t.bU(this);
    GMTrace.o(18287568093184L, 136253);
    return localt;
  }
  
  public final void cQ(boolean paramBoolean)
  {
    GMTrace.i(18287433875456L, 136252);
    adg();
    int i = getInputType() | 0x2;
    if (paramBoolean) {
      i |= 0x10;
    }
    for (;;)
    {
      setInputType(i);
      super.cQ(paramBoolean);
      adh();
      GMTrace.o(18287433875456L, 136252);
      return;
      i &= 0xFFFFFFEF;
    }
  }
  
  public final InputConnection onCreateInputConnection(EditorInfo paramEditorInfo)
  {
    GMTrace.i(17634464628736L, 131387);
    GMTrace.o(17634464628736L, 131387);
    return null;
  }
  
  public final void setFilters(InputFilter[] paramArrayOfInputFilter)
  {
    int i = 0;
    GMTrace.i(17277579689984L, 128728);
    InputFilter[] arrayOfInputFilter = paramArrayOfInputFilter;
    if (paramArrayOfInputFilter == null) {
      arrayOfInputFilter = new InputFilter[0];
    }
    paramArrayOfInputFilter = new InputFilter[arrayOfInputFilter.length + 1];
    while (i < arrayOfInputFilter.length)
    {
      paramArrayOfInputFilter[i] = arrayOfInputFilter[i];
      i += 1;
    }
    paramArrayOfInputFilter[i] = new InputFilter.AllCaps();
    super.setFilters(paramArrayOfInputFilter);
    GMTrace.o(17277579689984L, 128728);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\input\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */