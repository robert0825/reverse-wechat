package com.tencent.mm.plugin.appbrand.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelappbrand.a.b;
import com.tencent.mm.modelappbrand.a.e;
import com.tencent.mm.plugin.appbrand.o.d;
import com.tencent.mm.plugin.appbrand.o.f;
import com.tencent.mm.plugin.appbrand.o.g;
import com.tencent.mm.plugin.appbrand.o.h;
import com.tencent.mm.plugin.appbrand.o.i;
import com.tencent.mm.protocal.c.baa;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.AuthorizeItemListView;
import com.tencent.mm.ui.v;
import java.util.ArrayList;
import java.util.LinkedList;

public final class c
  extends com.tencent.mm.plugin.appbrand.widget.c.a
{
  private AuthorizeItemListView iIW;
  private b iIX;
  private LinearLayout iIY;
  private final String ibs;
  private final String mAppName;
  private Context mContext;
  
  public c(Context paramContext, final LinkedList<baa> paramLinkedList, String paramString1, String paramString2, final a parama)
  {
    super(paramContext, (byte)0);
    GMTrace.i(18247034339328L, 135951);
    this.mContext = paramContext;
    this.mAppName = bg.nl(paramString1);
    this.ibs = paramString2;
    if ((paramLinkedList == null) || (paramLinkedList.size() <= 0)) {
      throw new IllegalArgumentException("scopeInfoList is empty or null");
    }
    paramContext = (ViewGroup)v.fb(this.mContext).inflate(o.g.hCI, null);
    setContentView(paramContext);
    paramString1 = (ImageView)paramContext.findViewById(o.f.ben);
    b.CT().a(paramString1, this.ibs, com.tencent.mm.modelappbrand.a.a.CS(), e.grO);
    ((TextView)paramContext.findViewById(o.f.bes)).setText(this.mContext.getString(o.i.dGU, new Object[] { this.mAppName }));
    this.iIW = ((AuthorizeItemListView)paramContext.findViewById(o.f.bfd));
    this.iIX = new b(paramLinkedList);
    this.iIW.setAdapter(this.iIX);
    if (paramLinkedList.size() > 5)
    {
      this.iIW.Ob = paramLinkedList.size();
      this.iIY = ((LinearLayout)paramContext.findViewById(o.f.bfe));
      paramString1 = (LinearLayout.LayoutParams)this.iIY.getLayoutParams();
      paramString1.height = this.mContext.getResources().getDimensionPixelSize(o.d.aSy);
      this.iIY.setLayoutParams(paramString1);
    }
    ((Button)paramContext.findViewById(o.f.bLo)).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(10031567208448L, 74741);
        paramAnonymousView = new ArrayList();
        int i = 0;
        while (i < paramLinkedList.size())
        {
          if ((((baa)paramLinkedList.get(i)).uOa == 2) || (((baa)paramLinkedList.get(i)).uOa == 3)) {
            paramAnonymousView.add(((baa)paramLinkedList.get(i)).tWJ);
          }
          i += 1;
        }
        w.i("MicroMsg.AppBrandAuthorizeDialog", "stev acceptButton click!");
        Bundle localBundle = new Bundle();
        localBundle.putSerializable("key_scope", paramAnonymousView);
        parama.c(1, localBundle);
        jdField_this.dismiss();
        GMTrace.o(10031567208448L, 74741);
      }
    });
    ((Button)paramContext.findViewById(o.f.bLw)).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(10139209826304L, 75543);
        paramAnonymousView = new ArrayList();
        int i = 0;
        while (i < paramLinkedList.size())
        {
          if ((((baa)paramLinkedList.get(i)).uOa == 2) || (((baa)paramLinkedList.get(i)).uOa == 3)) {
            paramAnonymousView.add(((baa)paramLinkedList.get(i)).tWJ);
          }
          i += 1;
        }
        w.i("MicroMsg.AppBrandAuthorizeDialog", "stev rejectButton click!");
        Bundle localBundle = new Bundle();
        localBundle.putSerializable("key_scope", paramAnonymousView);
        parama.c(2, localBundle);
        jdField_this.dismiss();
        GMTrace.o(10139209826304L, 75543);
      }
    });
    setCanceledOnTouchOutside(false);
    setOnCancelListener(new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(18290386665472L, 136274);
        w.i("MicroMsg.AppBrandAuthorizeDialog", "stev dialog onCancel");
        parama.c(3, null);
        GMTrace.o(18290386665472L, 136274);
      }
    });
    GMTrace.o(18247034339328L, 135951);
  }
  
  public static abstract interface a
  {
    public abstract void c(int paramInt, Bundle paramBundle);
  }
  
  private static final class b
    extends BaseAdapter
  {
    private LinkedList<baa> iJc;
    
    b(LinkedList<baa> paramLinkedList)
    {
      GMTrace.i(18296560680960L, 136320);
      this.iJc = paramLinkedList;
      GMTrace.o(18296560680960L, 136320);
    }
    
    private baa jQ(int paramInt)
    {
      GMTrace.i(10046331158528L, 74851);
      baa localbaa = (baa)this.iJc.get(paramInt);
      GMTrace.o(10046331158528L, 74851);
      return localbaa;
    }
    
    public final int getCount()
    {
      GMTrace.i(10046196940800L, 74850);
      if (this.iJc == null)
      {
        GMTrace.o(10046196940800L, 74850);
        return 0;
      }
      int i = this.iJc.size();
      GMTrace.o(10046196940800L, 74850);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(10046465376256L, 74852);
      long l = paramInt;
      GMTrace.o(10046465376256L, 74852);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(10046599593984L, 74853);
      if ((this.iJc == null) || (this.iJc.size() <= 0))
      {
        GMTrace.o(10046599593984L, 74853);
        return null;
      }
      final baa localbaa = jQ(paramInt);
      final Object localObject;
      if (paramView == null)
      {
        paramView = new a();
        localObject = View.inflate(paramViewGroup.getContext(), o.g.cpy, null);
        paramView.iJg = ((ImageView)((View)localObject).findViewById(o.f.bed));
        paramView.iJh = ((TextView)((View)localObject).findViewById(o.f.bec));
        ((View)localObject).setTag(paramView);
        paramViewGroup = paramView;
        paramView = (View)localObject;
        if (localbaa.uOa != 1) {
          break label185;
        }
        paramViewGroup.iJg.setImageResource(o.h.cMV);
      }
      for (;;)
      {
        paramViewGroup.iJh.setText(localbaa.lPj);
        localObject = paramViewGroup.iJg;
        paramViewGroup.iJg.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(10045123198976L, 74842);
            if (localbaa.uOa == 2)
            {
              localObject.setImageResource(o.h.cMV);
              localbaa.uOa = 1;
              GMTrace.o(10045123198976L, 74842);
              return;
            }
            if (localbaa.uOa == 1)
            {
              localObject.setImageResource(o.h.cMT);
              localbaa.uOa = 2;
            }
            GMTrace.o(10045123198976L, 74842);
          }
        });
        GMTrace.o(10046599593984L, 74853);
        return paramView;
        paramViewGroup = (a)paramView.getTag();
        break;
        label185:
        if (localbaa.uOa == 3) {
          paramViewGroup.iJg.setImageResource(o.h.cMU);
        } else {
          paramViewGroup.iJg.setImageResource(o.h.cMT);
        }
      }
    }
    
    private static final class a
    {
      ImageView iJg;
      TextView iJh;
      
      public a()
      {
        GMTrace.i(18246900121600L, 135950);
        GMTrace.o(18246900121600L, 135950);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */