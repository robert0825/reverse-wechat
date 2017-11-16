package com.tencent.mm.ui.contact;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.j;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.q;
import com.tencent.mm.y.s;

public class ContactCountView
  extends FrameLayout
{
  private int count;
  private View kJj;
  private TextView moB;
  private boolean visible;
  int wQY;
  
  public ContactCountView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(1788719661056L, 13327);
    this.count = 0;
    this.visible = true;
    this.wQY = 1;
    init();
    GMTrace.o(1788719661056L, 13327);
  }
  
  public ContactCountView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(1788585443328L, 13326);
    this.count = 0;
    this.visible = true;
    this.wQY = 1;
    init();
    GMTrace.o(1788585443328L, 13326);
  }
  
  private void init()
  {
    GMTrace.i(1788853878784L, 13328);
    inflate(getContext(), R.i.ctG, this);
    GMTrace.o(1788853878784L, 13328);
  }
  
  public final void cgl()
  {
    GMTrace.i(1789122314240L, 13330);
    String[] arrayOfString = s.gmD;
    if (this.wQY == 1)
    {
      at.AR();
      this.count = c.yK().b(arrayOfString, new String[] { q.zE(), "weixin", "helper_entry", "filehelper" });
      w.d("MicroMsg.ContactCountView", "contact count %d", new Object[] { Integer.valueOf(this.count) });
      if (this.moB != null)
      {
        if (this.wQY != 1) {
          break label200;
        }
        this.moB.setText(getContext().getResources().getQuantityString(R.j.cIf, this.count, new Object[] { Integer.valueOf(this.count) }));
      }
    }
    for (;;)
    {
      setVisible(this.visible);
      GMTrace.o(1789122314240L, 13330);
      return;
      at.AR();
      this.count = c.yK().c(arrayOfString, new String[] { q.zE(), "weixin", "helper_entry", "filehelper" });
      break;
      label200:
      this.moB.setText(getContext().getResources().getQuantityString(R.j.cIe, this.count, new Object[] { Integer.valueOf(this.count) }));
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(1788988096512L, 13329);
    w.d("MicroMsg.ContactCountView", "onMeasure");
    if (this.kJj == null)
    {
      this.kJj = ((FrameLayout)findViewById(R.h.bqo));
      this.moB = ((TextView)findViewById(R.h.bqn));
    }
    cgl();
    super.onMeasure(paramInt1, paramInt2);
    GMTrace.o(1788988096512L, 13329);
  }
  
  public final void setVisible(boolean paramBoolean)
  {
    GMTrace.i(1789256531968L, 13331);
    this.visible = paramBoolean;
    View localView;
    if (this.kJj != null)
    {
      localView = this.kJj;
      if ((!paramBoolean) || (this.count <= 0)) {
        break label54;
      }
    }
    label54:
    for (int i = 0;; i = 8)
    {
      localView.setVisibility(i);
      GMTrace.o(1789256531968L, 13331);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\contact\ContactCountView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */