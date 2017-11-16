package com.tencent.mm.plugin.sight.draft.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.l;

public class SightDraftContainerView
  extends ListView
{
  private boolean oUx;
  a oUy;
  b oUz;
  
  public SightDraftContainerView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(9364505100288L, 69771);
    init();
    GMTrace.o(9364505100288L, 69771);
  }
  
  public SightDraftContainerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(9364370882560L, 69770);
    init();
    GMTrace.o(9364370882560L, 69770);
  }
  
  public SightDraftContainerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(9364236664832L, 69769);
    init();
    GMTrace.o(9364236664832L, 69769);
  }
  
  private void init()
  {
    GMTrace.i(9364639318016L, 69772);
    setBackgroundColor(getResources().getColor(R.e.black));
    setSelector(R.e.transparent);
    int i = getResources().getDimensionPixelSize(R.f.aQN);
    int j = getResources().getDimensionPixelSize(R.f.aQq);
    TextView localTextView = new TextView(getContext());
    localTextView.setText(R.l.eda);
    localTextView.setTextSize(0, com.tencent.mm.br.a.V(getContext(), R.f.aQo));
    localTextView.setGravity(17);
    localTextView.setTextColor(getResources().getColor(R.e.aOb));
    localTextView.setTextSize(1, 11.0F);
    localTextView.setPadding(0, i, 0, j);
    addFooterView(localTextView);
    setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(9363297140736L, 69762);
        paramAnonymousView = SightDraftContainerView.this;
        if (paramAnonymousView.oUz != null)
        {
          paramAnonymousView = paramAnonymousView.oUz;
          paramAnonymousView.a(null);
          paramAnonymousView.oUc.bgV();
        }
        GMTrace.o(9363297140736L, 69762);
        return false;
      }
    });
    GMTrace.o(9364639318016L, 69772);
  }
  
  public final void bgW()
  {
    GMTrace.i(9364773535744L, 69773);
    if (this.oUx)
    {
      this.oUz.oUj = 12;
      this.oUz.a(b.d.oUp, false);
      this.oUz.a(null, null);
      setSelection(0);
      GMTrace.o(9364773535744L, 69773);
      return;
    }
    this.oUx = true;
    this.oUz = new b(getContext(), this.oUy);
    this.oUz.oUj = 12;
    setAdapter(this.oUz);
    GMTrace.o(9364773535744L, 69773);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\sight\draft\ui\SightDraftContainerView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */