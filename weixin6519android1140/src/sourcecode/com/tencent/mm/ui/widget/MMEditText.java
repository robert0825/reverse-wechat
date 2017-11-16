package com.tencent.mm.ui.widget;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.PasterEditText;
import com.tencent.mm.ui.f.c.b;

public class MMEditText
  extends PasterEditText
{
  int sfj;
  public InputConnection xqp;
  public a xqq;
  
  public MMEditText(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(1636248322048L, 12191);
    this.sfj = 0;
    GMTrace.o(1636248322048L, 12191);
  }
  
  public MMEditText(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(1635979886592L, 12189);
    this.sfj = 0;
    GMTrace.o(1635979886592L, 12189);
  }
  
  private void OX(String paramString)
  {
    GMTrace.i(1636650975232L, 12194);
    int i = getSelectionStart();
    setText(b.c(getContext(), paramString, getTextSize()));
    int j = getText().length() - paramString.length();
    if (j > 0)
    {
      i += j;
      if (i <= getText().length()) {
        setSelection(i);
      }
      GMTrace.o(1636650975232L, 12194);
      return;
    }
    setSelection(i);
    GMTrace.o(1636650975232L, 12194);
  }
  
  public final void Xi(String paramString)
  {
    GMTrace.i(1636382539776L, 12192);
    int i = b.o(getContext(), getText().toString(), getSelectionStart());
    int j = b.o(getContext(), getText().toString(), getSelectionEnd());
    Object localObject = new StringBuffer(getText());
    localObject = ((StringBuffer)localObject).substring(0, i) + paramString + ((StringBuffer)localObject).substring(j, ((StringBuffer)localObject).length());
    setText(b.c(getContext(), (CharSequence)localObject, getTextSize()));
    setSelection(i + paramString.length());
    GMTrace.o(1636382539776L, 12192);
  }
  
  public InputConnection onCreateInputConnection(EditorInfo paramEditorInfo)
  {
    GMTrace.i(1636114104320L, 12190);
    this.xqp = super.onCreateInputConnection(paramEditorInfo);
    paramEditorInfo = this.xqp;
    GMTrace.o(1636114104320L, 12190);
    return paramEditorInfo;
  }
  
  public boolean onKeyPreIme(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(1636785192960L, 12195);
    if (this.xqq == null) {}
    KeyEvent.DispatcherState localDispatcherState;
    for (boolean bool = true;; bool = false)
    {
      w.v("MicroMsg.MMEditText", "on onKeyPreIme, listener null ? %B", new Object[] { Boolean.valueOf(bool) });
      if ((this.xqq == null) || (paramInt != 4)) {
        break label203;
      }
      if ((paramKeyEvent.getAction() != 0) || (paramKeyEvent.getRepeatCount() != 0)) {
        break;
      }
      w.v("MicroMsg.MMEditText", "on onKeyPreIme action down");
      localDispatcherState = getKeyDispatcherState();
      if (localDispatcherState != null) {
        localDispatcherState.startTracking(paramKeyEvent, this);
      }
      GMTrace.o(1636785192960L, 12195);
      return true;
    }
    if (paramKeyEvent.getAction() == 1)
    {
      w.v("MicroMsg.MMEditText", "on onKeyPreIme action up");
      localDispatcherState = getKeyDispatcherState();
      if (localDispatcherState != null) {
        localDispatcherState.handleUpEvent(paramKeyEvent);
      }
      if ((paramKeyEvent.isTracking()) && (!paramKeyEvent.isCanceled()))
      {
        w.v("MicroMsg.MMEditText", "on onKeyPreIme action up is tracking");
        this.xqq.aME();
        paramKeyEvent = (InputMethodManager)getContext().getSystemService("input_method");
        if (paramKeyEvent != null) {
          paramKeyEvent.hideSoftInputFromWindow(getWindowToken(), 0);
        }
        GMTrace.o(1636785192960L, 12195);
        return true;
      }
    }
    label203:
    bool = super.onKeyPreIme(paramInt, paramKeyEvent);
    GMTrace.o(1636785192960L, 12195);
    return bool;
  }
  
  /* Error */
  public boolean onTextContextMenuItem(int paramInt)
  {
    // Byte code:
    //   0: ldc2_w 215
    //   3: sipush 12193
    //   6: invokestatic 31	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_0
    //   10: iload_1
    //   11: invokespecial 218	com/tencent/mm/ui/base/PasterEditText:onTextContextMenuItem	(I)Z
    //   14: istore_2
    //   15: iload_1
    //   16: ldc -37
    //   18: if_icmpne +21 -> 39
    //   21: aload_0
    //   22: iconst_0
    //   23: putfield 33	com/tencent/mm/ui/widget/MMEditText:sfj	I
    //   26: aload_0
    //   27: invokevirtual 71	com/tencent/mm/ui/widget/MMEditText:getText	()Landroid/text/Editable;
    //   30: invokevirtual 92	java/lang/Object:toString	()Ljava/lang/String;
    //   33: astore_3
    //   34: aload_0
    //   35: aload_3
    //   36: invokespecial 221	com/tencent/mm/ui/widget/MMEditText:OX	(Ljava/lang/String;)V
    //   39: ldc2_w 215
    //   42: sipush 12193
    //   45: invokestatic 36	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   48: iload_2
    //   49: ireturn
    //   50: astore_3
    //   51: ldc -123
    //   53: ldc -33
    //   55: iconst_1
    //   56: anewarray 88	java/lang/Object
    //   59: dup
    //   60: iconst_0
    //   61: aload_3
    //   62: aastore
    //   63: invokestatic 226	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   66: iconst_0
    //   67: istore_2
    //   68: goto -53 -> 15
    //   71: astore_3
    //   72: ldc -123
    //   74: ldc -28
    //   76: iconst_1
    //   77: anewarray 88	java/lang/Object
    //   80: dup
    //   81: iconst_0
    //   82: aload_3
    //   83: aastore
    //   84: invokestatic 226	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   87: ldc2_w 215
    //   90: sipush 12193
    //   93: invokestatic 36	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   96: iconst_0
    //   97: ireturn
    //   98: astore 4
    //   100: ldc -123
    //   102: ldc -26
    //   104: iconst_1
    //   105: anewarray 88	java/lang/Object
    //   108: dup
    //   109: iconst_0
    //   110: aload_0
    //   111: getfield 33	com/tencent/mm/ui/widget/MMEditText:sfj	I
    //   114: invokestatic 235	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   117: aastore
    //   118: invokestatic 226	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   121: aload_0
    //   122: getfield 33	com/tencent/mm/ui/widget/MMEditText:sfj	I
    //   125: iconst_3
    //   126: if_icmpge +36 -> 162
    //   129: aload_0
    //   130: aload_0
    //   131: getfield 33	com/tencent/mm/ui/widget/MMEditText:sfj	I
    //   134: iconst_1
    //   135: iadd
    //   136: putfield 33	com/tencent/mm/ui/widget/MMEditText:sfj	I
    //   139: aload_0
    //   140: new 104	java/lang/StringBuilder
    //   143: dup
    //   144: ldc -19
    //   146: invokespecial 239	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   149: aload_3
    //   150: invokevirtual 115	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   153: invokevirtual 117	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   156: invokespecial 221	com/tencent/mm/ui/widget/MMEditText:OX	(Ljava/lang/String;)V
    //   159: goto -120 -> 39
    //   162: aload 4
    //   164: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	165	0	this	MMEditText
    //   0	165	1	paramInt	int
    //   14	54	2	bool	boolean
    //   33	3	3	str	String
    //   50	12	3	localIndexOutOfBoundsException1	IndexOutOfBoundsException
    //   71	79	3	localNullPointerException	NullPointerException
    //   98	65	4	localIndexOutOfBoundsException2	IndexOutOfBoundsException
    // Exception table:
    //   from	to	target	type
    //   9	15	50	java/lang/IndexOutOfBoundsException
    //   9	15	71	java/lang/NullPointerException
    //   34	39	98	java/lang/IndexOutOfBoundsException
  }
  
  public static abstract interface a
  {
    public abstract void aME();
  }
  
  public static abstract interface b
  {
    public abstract void bcg();
  }
  
  public static final class c
    implements TextWatcher
  {
    private final int aCN;
    private EditText nUE;
    private TextView xqr;
    public MMEditText.b xqs;
    private boolean xqt;
    
    public c(EditText paramEditText, TextView paramTextView, int paramInt)
    {
      GMTrace.i(1628463693824L, 12133);
      this.xqs = null;
      this.xqt = false;
      this.nUE = paramEditText;
      this.xqr = paramTextView;
      this.aCN = paramInt;
      GMTrace.o(1628463693824L, 12133);
    }
    
    public final void afterTextChanged(Editable paramEditable)
    {
      int m = 0;
      GMTrace.i(1628597911552L, 12134);
      String str1 = paramEditable.toString();
      paramEditable = "";
      int i = 0;
      int j = 0;
      int k = i;
      if (j < str1.length())
      {
        if (bg.h(str1.charAt(j))) {
          i += 2;
        }
        for (;;)
        {
          k = i;
          if (i > this.aCN) {
            break label102;
          }
          paramEditable = paramEditable + str1.charAt(j);
          j += 1;
          break;
          i += 1;
        }
      }
      label102:
      if (k > this.aCN) {}
      for (;;)
      {
        try
        {
          this.nUE.setText(paramEditable);
          if (this.xqt) {
            continue;
          }
          i = this.nUE.getText().toString().length();
          this.nUE.setSelection(i);
          this.xqt = false;
        }
        catch (Exception localException)
        {
          this.xqt = true;
          String str2 = localException.getMessage();
          w.e("MicroMsg.MMEditText", "error " + str2);
          this.nUE.setText(paramEditable);
          this.nUE.setSelection(0);
          continue;
          continue;
        }
        i = this.aCN - k;
        if (i >= 0) {
          continue;
        }
        i = m;
        if (this.xqr != null) {
          this.xqr.setText(i / 2);
        }
        GMTrace.o(1628597911552L, 12134);
        return;
        this.nUE.setSelection(0);
      }
    }
    
    public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
    {
      GMTrace.i(1628732129280L, 12135);
      GMTrace.o(1628732129280L, 12135);
    }
    
    public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
    {
      GMTrace.i(1628866347008L, 12136);
      if (this.xqs != null) {
        this.xqs.bcg();
      }
      GMTrace.o(1628866347008L, 12136);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\widget\MMEditText.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */