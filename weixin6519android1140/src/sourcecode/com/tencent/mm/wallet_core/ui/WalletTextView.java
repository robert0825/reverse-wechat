package com.tencent.mm.wallet_core.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.text.Selection;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.d;
import com.tencent.mm.wallet_core.f.a;
import java.lang.reflect.Field;
import java.util.Map;

@SuppressLint({"AppCompatCustomView"})
public class WalletTextView
  extends TextView
{
  private static final String TAG;
  private static Field yvO;
  private static Field yvP;
  private Object vjg;
  private Object xFd;
  private volatile boolean xFe;
  
  static
  {
    GMTrace.i(20855690100736L, 155387);
    TAG = "MicroMsg." + new StringBuilder("weiVtxeTtellaW").reverse().toString();
    yvO = null;
    yvP = null;
    try
    {
      Field localField = TextView.class.getDeclaredField("mText");
      yvO = localField;
      localField.setAccessible(true);
      localField = TextView.class.getDeclaredField("mTransformed");
      yvP = localField;
      localField.setAccessible(true);
      GMTrace.o(20855690100736L, 155387);
      return;
    }
    catch (Throwable localThrowable)
    {
      w.printErrStackTrace(TAG, localThrowable, "", new Object[0]);
      GMTrace.o(20855690100736L, 155387);
    }
  }
  
  public WalletTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(1477334532096L, 11007);
    this.vjg = "";
    this.xFd = "";
    this.xFe = false;
    GMTrace.o(1477334532096L, 11007);
  }
  
  public WalletTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(1477468749824L, 11008);
    this.vjg = "";
    this.xFd = "";
    this.xFe = false;
    GMTrace.o(1477468749824L, 11008);
  }
  
  private void W(CharSequence paramCharSequence)
  {
    GMTrace.i(21067351457792L, 156964);
    Object localObject = paramCharSequence;
    if (paramCharSequence == null) {
      localObject = "";
    }
    try
    {
      yvO.set(this, localObject);
      yvP.set(this, localObject);
      GMTrace.o(21067351457792L, 156964);
      return;
    }
    catch (Throwable paramCharSequence)
    {
      this.xFe = true;
      setText((CharSequence)localObject);
      this.xFe = false;
      GMTrace.o(21067351457792L, 156964);
    }
  }
  
  private static boolean cud()
  {
    GMTrace.i(21067083022336L, 156962);
    if (!h.tE())
    {
      w.w(TAG, "check point 1, explained by src code.");
      GMTrace.o(21067083022336L, 156962);
      return false;
    }
    Object localObject = com.tencent.mm.y.c.c.Ct().er("100327");
    if (!((com.tencent.mm.storage.c)localObject).isValid())
    {
      w.w(TAG, "check point 2, explained by src code.");
      GMTrace.o(21067083022336L, 156962);
      return false;
    }
    localObject = ((com.tencent.mm.storage.c)localObject).bSg();
    if (localObject == null)
    {
      w.w(TAG, "check point 3, explained by src code.");
      GMTrace.o(21067083022336L, 156962);
      return false;
    }
    boolean bool;
    if (!"0".equals((String)((Map)localObject).get(new String(new byte[] { 73, 115, 79, 112, 101, 110 }))))
    {
      bool = true;
      if (!bool) {
        break label180;
      }
      w.i(TAG, "check point 4, explained by src code.");
    }
    for (;;)
    {
      GMTrace.o(21067083022336L, 156962);
      return bool;
      bool = false;
      break;
      label180:
      w.w(TAG, "check point 5, explained by src code.");
    }
  }
  
  public void draw(Canvas paramCanvas)
  {
    GMTrace.i(20855287447552L, 155384);
    W((CharSequence)this.vjg);
    super.draw(paramCanvas);
    W((CharSequence)this.xFd);
    GMTrace.o(20855287447552L, 155384);
  }
  
  public int getSelectionEnd()
  {
    GMTrace.i(20855555883008L, 155386);
    int i = Selection.getSelectionEnd((CharSequence)this.vjg);
    GMTrace.o(20855555883008L, 155386);
    return i;
  }
  
  public int getSelectionStart()
  {
    GMTrace.i(20855421665280L, 155385);
    int i = Selection.getSelectionStart((CharSequence)this.vjg);
    GMTrace.o(20855421665280L, 155385);
    return i;
  }
  
  @Deprecated
  public CharSequence getText()
  {
    GMTrace.i(19127502635008L, 142511);
    boolean bool = true;
    if (cud()) {
      bool = a.cmc().ci(this);
    }
    if (bool)
    {
      localCharSequence = (CharSequence)this.vjg;
      GMTrace.o(19127502635008L, 142511);
      return localCharSequence;
    }
    CharSequence localCharSequence = (CharSequence)this.xFd;
    GMTrace.o(19127502635008L, 142511);
    return localCharSequence;
  }
  
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    GMTrace.i(21067217240064L, 156963);
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    if ((cud()) && (!a.cmc().ci(this)))
    {
      paramAccessibilityNodeInfo.setText((CharSequence)this.xFd);
      GMTrace.o(21067217240064L, 156963);
      return;
    }
    paramAccessibilityNodeInfo.setText((CharSequence)this.vjg);
    GMTrace.o(21067217240064L, 156963);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(20855019012096L, 155382);
    this.xFe = true;
    setText((CharSequence)this.vjg);
    this.xFe = false;
    super.onMeasure(paramInt1, paramInt2);
    GMTrace.o(20855019012096L, 155382);
  }
  
  public void setText(CharSequence paramCharSequence, TextView.BufferType paramBufferType)
  {
    GMTrace.i(20854884794368L, 155381);
    if (!this.xFe)
    {
      this.vjg = paramCharSequence;
      String str = paramCharSequence.toString();
      if ((str == null) || (str.length() == 0)) {}
      byte[] arrayOfByte;
      for (str = "";; str = str.replaceAll(new String(arrayOfByte), String.valueOf((char)arrayOfByte[1])))
      {
        this.xFd = str;
        super.setText(paramCharSequence, paramBufferType);
        W((CharSequence)this.xFd);
        GMTrace.o(20854884794368L, 155381);
        return;
        arrayOfByte = new byte[5];
        byte[] tmp79_77 = arrayOfByte;
        tmp79_77[0] = 91;
        byte[] tmp85_79 = tmp79_77;
        tmp85_79[1] = 48;
        byte[] tmp91_85 = tmp85_79;
        tmp91_85[2] = 45;
        byte[] tmp97_91 = tmp91_85;
        tmp97_91[3] = 57;
        byte[] tmp103_97 = tmp97_91;
        tmp103_97[4] = 93;
        tmp103_97;
      }
    }
    super.setText(paramCharSequence, paramBufferType);
    GMTrace.o(20854884794368L, 155381);
  }
  
  public void setTypeface(Typeface paramTypeface)
  {
    GMTrace.i(1477737185280L, 11010);
    super.setTypeface(e.cQ(getContext()));
    GMTrace.o(1477737185280L, 11010);
  }
  
  public void setTypeface(Typeface paramTypeface, int paramInt)
  {
    GMTrace.i(1477602967552L, 11009);
    super.setTypeface(e.cQ(getContext()), paramInt);
    GMTrace.o(1477602967552L, 11009);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\wallet_core\ui\WalletTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */