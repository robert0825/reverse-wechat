package com.tencent.mm.ui.contact;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.ac.n;
import com.tencent.mm.af.e;
import com.tencent.mm.af.x;
import com.tencent.mm.br.a;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MaskLayout;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public class BizContactEntranceView
  extends RelativeLayout
{
  private View kfZ;
  private Context mContext;
  private View wQK;
  private TextView wQL;
  private boolean wQM;
  private boolean wQN;
  
  public BizContactEntranceView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(1838246002688L, 13696);
    this.kfZ = null;
    this.wQM = true;
    this.mContext = paramContext;
    init();
    cgk();
    GMTrace.o(1838246002688L, 13696);
  }
  
  public BizContactEntranceView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(1838111784960L, 13695);
    this.kfZ = null;
    this.wQM = true;
    this.mContext = paramContext;
    init();
    cgk();
    GMTrace.o(1838111784960L, 13695);
  }
  
  public BizContactEntranceView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(1837977567232L, 13694);
    this.kfZ = null;
    this.wQM = true;
    this.mContext = paramContext;
    init();
    cgk();
    GMTrace.o(1837977567232L, 13694);
  }
  
  private void init()
  {
    GMTrace.i(1838380220416L, 13697);
    this.wQN = false;
    View.inflate(getContext(), R.i.cql, this);
    this.kfZ = findViewById(R.h.brL);
    this.wQK = this.kfZ.findViewById(R.h.bhr);
    Object localObject = this.wQK.getLayoutParams();
    ((ViewGroup.LayoutParams)localObject).height = ((int)(a.W(getContext(), R.f.aPH) * a.ec(getContext())));
    this.wQK.setLayoutParams((ViewGroup.LayoutParams)localObject);
    this.kfZ.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(1780398161920L, 13265);
        Intent localIntent = new Intent();
        localIntent.putExtra("intent_service_type", 251658241);
        com.tencent.mm.bj.d.b(paramAnonymousView.getContext(), "brandservice", ".ui.BrandServiceIndexUI", localIntent);
        GMTrace.o(1780398161920L, 13265);
      }
    });
    this.wQK.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(1729932296192L, 12889);
        if ((BizContactEntranceView.a(BizContactEntranceView.this) instanceof MMActivity)) {
          ((MMActivity)BizContactEntranceView.a(BizContactEntranceView.this)).aLo();
        }
        GMTrace.o(1729932296192L, 12889);
        return false;
      }
    });
    localObject = (MaskLayout)this.wQK.findViewById(R.h.bhq);
    ImageView localImageView = (ImageView)((MaskLayout)localObject).view;
    n.Dh();
    localImageView.setImageBitmap(com.tencent.mm.ac.d.hZ("service_officialaccounts"));
    this.wQL = ((TextView)((MaskLayout)localObject).findViewById(R.h.chA));
    GMTrace.o(1838380220416L, 13697);
  }
  
  final void cgk()
  {
    GMTrace.i(1838514438144L, 13698);
    long l = System.currentTimeMillis();
    at.AR();
    int j = c.yK().bSQ();
    View localView;
    if (j > 0)
    {
      this.wQM = true;
      localView = this.wQK;
      if (!this.wQM) {
        break label135;
      }
    }
    label135:
    for (int i = 0;; i = 8)
    {
      localView.setVisibility(i);
      if (this.wQM) {
        at.xB().A(new Runnable()
        {
          public final void run()
          {
            final long l1 = 0L;
            GMTrace.i(1807375925248L, 13466);
            Object localObject1 = x.FG();
            Object localObject2 = new StringBuilder();
            ((StringBuilder)localObject2).append("select updateTime from BizInfo").append(" where type = 1");
            ((StringBuilder)localObject2).append(" and status = 1").append(" ORDER BY updateTime DESC");
            localObject2 = ((StringBuilder)localObject2).toString();
            w.i("MicroMsg.BizInfoStorage", "getLastNewBizUpdateTime, sql %s", new Object[] { localObject2 });
            localObject1 = ((e)localObject1).rawQuery((String)localObject2, new String[0]);
            if (localObject1 == null) {}
            for (;;)
            {
              at.AR();
              long l2 = bg.bH(c.xh().get(233473, null));
              w.i("MicroMsg.BizContactEntranceView", "last updateTime %d, enterTime %d", new Object[] { Long.valueOf(l1), Long.valueOf(l2) });
              af.t(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(1793283063808L, 13361);
                  TextView localTextView = BizContactEntranceView.c(BizContactEntranceView.this);
                  if ((BizContactEntranceView.b(BizContactEntranceView.this)) && (l1 > this.wQQ)) {}
                  for (int i = 0;; i = 4)
                  {
                    localTextView.setVisibility(i);
                    GMTrace.o(1793283063808L, 13361);
                    return;
                  }
                }
              });
              GMTrace.o(1807375925248L, 13466);
              return;
              if (!((Cursor)localObject1).moveToFirst())
              {
                ((Cursor)localObject1).close();
              }
              else
              {
                l1 = ((Cursor)localObject1).getLong(0);
                ((Cursor)localObject1).close();
              }
            }
          }
        });
      }
      w.i("MicroMsg.BizContactEntranceView", "biz contact Count %d, isEntranceShow %s, setStatus cost %d", new Object[] { Integer.valueOf(j), Boolean.valueOf(this.wQM), Long.valueOf(System.currentTimeMillis() - l) });
      GMTrace.o(1838514438144L, 13698);
      return;
      this.wQM = false;
      break;
    }
  }
  
  public final void setVisible(boolean paramBoolean)
  {
    int i = 0;
    GMTrace.i(1838648655872L, 13699);
    w.i("MicroMsg.BizContactEntranceView", "setVisible visible = %s, isEntranceShow = %s", new Object[] { Boolean.valueOf(true), Boolean.valueOf(this.wQM) });
    View localView = this.kfZ;
    if (this.wQM) {}
    for (;;)
    {
      localView.setVisibility(i);
      GMTrace.o(1838648655872L, 13699);
      return;
      i = 8;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\contact\BizContactEntranceView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */