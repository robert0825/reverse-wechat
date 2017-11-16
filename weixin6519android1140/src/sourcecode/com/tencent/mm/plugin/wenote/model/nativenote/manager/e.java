package com.tencent.mm.plugin.wenote.model.nativenote.manager;

import android.widget.EditText;
import com.tencent.gmtrace.GMTrace;
import java.io.Serializable;

public class e
  implements Serializable
{
  public int Vw;
  public int vt;
  
  public e(int paramInt1, int paramInt2)
  {
    GMTrace.i(17227516477440L, 128355);
    this.Vw = paramInt1;
    this.vt = paramInt2;
    if (this.Vw > this.vt)
    {
      paramInt1 = this.vt;
      this.vt = this.Vw;
      this.Vw = paramInt1;
    }
    GMTrace.o(17227516477440L, 128355);
  }
  
  public e(EditText paramEditText)
  {
    this(paramEditText.getSelectionStart(), paramEditText.getSelectionEnd());
    GMTrace.i(20642820784128L, 153801);
    GMTrace.o(20642820784128L, 153801);
  }
  
  public final e dO(int paramInt1, int paramInt2)
  {
    GMTrace.i(20643089219584L, 153803);
    this.Vw = Math.max(0, this.Vw - paramInt1);
    this.vt += paramInt2;
    GMTrace.o(20643089219584L, 153803);
    return this;
  }
  
  public final boolean isEmpty()
  {
    GMTrace.i(20642955001856L, 153802);
    if (this.Vw == this.vt)
    {
      GMTrace.o(20642955001856L, 153802);
      return true;
    }
    GMTrace.o(20642955001856L, 153802);
    return false;
  }
  
  public String toString()
  {
    GMTrace.i(17227650695168L, 128356);
    String str = "[" + this.Vw + ", " + this.vt + "]";
    GMTrace.o(17227650695168L, 128356);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\model\nativenote\manager\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */