package com.tencent.mm.ui.base;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.EditText;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.v.a.e;
import com.tencent.mm.v.a.j;

public class MMVisiblePasswordEditText
  extends EditText
{
  public String iQk;
  final Drawable wgo;
  final Drawable wgp;
  private boolean wgq;
  
  public MMVisiblePasswordEditText(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(3355040546816L, 24997);
    this.iQk = "";
    this.wgo = getResources().getDrawable(a.j.ggb);
    this.wgp = getResources().getDrawable(a.j.ggc);
    this.wgq = false;
    bZG();
    GMTrace.o(3355040546816L, 24997);
  }
  
  public MMVisiblePasswordEditText(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(3355174764544L, 24998);
    this.iQk = "";
    this.wgo = getResources().getDrawable(a.j.ggb);
    this.wgp = getResources().getDrawable(a.j.ggc);
    this.wgq = false;
    bZG();
    GMTrace.o(3355174764544L, 24998);
  }
  
  private void bZG()
  {
    GMTrace.i(3355308982272L, 24999);
    this.wgo.setBounds(0, 0, this.wgo.getIntrinsicWidth(), this.wgo.getIntrinsicHeight());
    this.wgp.setBounds(0, 0, this.wgp.getIntrinsicWidth(), this.wgp.getIntrinsicHeight());
    w.d("MicroMsg.MMVisiblePasswordEditText", "closeEye width %d height %d", new Object[] { Integer.valueOf(this.wgo.getIntrinsicWidth()), Integer.valueOf(this.wgo.getIntrinsicHeight()) });
    cay();
    setHeight(this.wgo.getIntrinsicHeight() + getResources().getDimensionPixelSize(a.e.aQG) * 5);
    setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        boolean bool = true;
        GMTrace.i(3185657774080L, 23735);
        paramAnonymousView = MMVisiblePasswordEditText.this;
        if (paramAnonymousView.getCompoundDrawables()[2] == null)
        {
          GMTrace.o(3185657774080L, 23735);
          return false;
        }
        if (paramAnonymousMotionEvent.getAction() != 1)
        {
          GMTrace.o(3185657774080L, 23735);
          return false;
        }
        if (paramAnonymousMotionEvent.getX() > paramAnonymousView.getWidth() - paramAnonymousView.getPaddingRight() - MMVisiblePasswordEditText.this.wgo.getIntrinsicWidth())
        {
          paramAnonymousView = MMVisiblePasswordEditText.this;
          if (MMVisiblePasswordEditText.a(MMVisiblePasswordEditText.this)) {
            break label123;
          }
        }
        for (;;)
        {
          MMVisiblePasswordEditText.a(paramAnonymousView, bool);
          MMVisiblePasswordEditText.b(MMVisiblePasswordEditText.this);
          GMTrace.o(3185657774080L, 23735);
          return false;
          label123:
          bool = false;
        }
      }
    });
    GMTrace.o(3355308982272L, 24999);
  }
  
  private void cay()
  {
    GMTrace.i(3355443200000L, 25000);
    int i = getSelectionStart();
    int j = getSelectionEnd();
    if (this.wgq)
    {
      setInputType(1);
      setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], this.wgp, getCompoundDrawables()[3]);
    }
    for (;;)
    {
      setSelection(i, j);
      GMTrace.o(3355443200000L, 25000);
      return;
      setInputType(129);
      setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], this.wgo, getCompoundDrawables()[3]);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\base\MMVisiblePasswordEditText.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */