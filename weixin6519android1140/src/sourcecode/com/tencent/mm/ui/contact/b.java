package com.tencent.mm.ui.contact;

import android.content.Context;
import android.content.Intent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.br.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MaskLayout;

public final class b
  extends RelativeLayout
{
  private TextView contentView;
  private Context context;
  private View kJj;
  private View mOO;
  
  public b(Context paramContext, final a parama)
  {
    super(paramContext);
    GMTrace.i(1731140255744L, 12898);
    this.kJj = null;
    this.mOO = null;
    this.contentView = null;
    this.context = paramContext;
    View.inflate(getContext(), R.i.coU, this);
    this.kJj = findViewById(R.h.brL);
    this.mOO = this.kJj.findViewById(R.h.bdh);
    paramContext = this.mOO.getLayoutParams();
    paramContext.height = ((int)(a.W(this.context, R.f.aPH) * a.ec(this.context)));
    this.mOO.setLayoutParams(paramContext);
    this.contentView = ((TextView)this.mOO.findViewById(R.h.bdj));
    this.kJj.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(1708323241984L, 12728);
        switch (b.3.wQl[parama.ordinal()])
        {
        default: 
          w.e("MicroMsg.ChatroomContactEntranceView", "[cpan] unknow type for click. type:%s", new Object[] { parama });
          GMTrace.o(1708323241984L, 12728);
          return;
        case 1: 
          paramAnonymousView = new Intent();
          paramAnonymousView.setClassName(b.a(b.this), "com.tencent.mm.ui.contact.ChatroomContactUI");
          b.a(b.this).startActivity(paramAnonymousView);
          GMTrace.o(1708323241984L, 12728);
          return;
        case 2: 
          paramAnonymousView = new Intent();
          com.tencent.mm.bj.d.b(b.a(b.this), "label", ".ui.ContactLabelManagerUI", paramAnonymousView);
          GMTrace.o(1708323241984L, 12728);
          return;
        }
        paramAnonymousView = new Intent();
        com.tencent.mm.bj.d.b(b.a(b.this), "ipcall", ".ui.IPCallAddressUI", paramAnonymousView);
        GMTrace.o(1708323241984L, 12728);
      }
    });
    this.mOO.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(1708860112896L, 12732);
        if ((b.a(b.this) instanceof MMActivity)) {
          ((MMActivity)b.a(b.this)).aLo();
        }
        GMTrace.o(1708860112896L, 12732);
        return false;
      }
    });
    paramContext = (ImageView)((MaskLayout)this.mOO.findViewById(R.h.bdi)).view;
    switch (3.wQl[parama.ordinal()])
    {
    }
    for (;;)
    {
      GMTrace.o(1731140255744L, 12898);
      return;
      this.contentView.setText(R.l.cQO);
      com.tencent.mm.ac.d.a(getContext(), paramContext, R.k.cLO);
      GMTrace.o(1731140255744L, 12898);
      return;
      this.contentView.setText(R.l.cQR);
      com.tencent.mm.ac.d.a(getContext(), paramContext, R.k.cLP);
      GMTrace.o(1731140255744L, 12898);
      return;
      this.mOO.setBackgroundResource(R.g.aVO);
      this.contentView.setText(R.l.cQQ);
      com.tencent.mm.ac.d.a(getContext(), paramContext, R.k.cLR);
    }
  }
  
  public final void setVisible(boolean paramBoolean)
  {
    GMTrace.i(1731274473472L, 12899);
    View localView = this.kJj;
    if (paramBoolean) {}
    for (int i = 0;; i = 8)
    {
      localView.setVisibility(i);
      GMTrace.o(1731274473472L, 12899);
      return;
    }
  }
  
  public static enum a
  {
    static
    {
      GMTrace.i(1843748929536L, 13737);
      wQm = new a("Chatromm", 0);
      wQn = new a("ContactLabel", 1);
      wQo = new a("ContactIpCall", 2);
      wQp = new a[] { wQm, wQn, wQo };
      GMTrace.o(1843748929536L, 13737);
    }
    
    private a()
    {
      GMTrace.i(1843614711808L, 13736);
      GMTrace.o(1843614711808L, 13736);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\contact\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */