package com.tencent.mm.plugin.appbrand.widget.sms;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.o.f;
import com.tencent.mm.plugin.appbrand.o.g;
import com.tencent.mm.sdk.platformtools.w;

public class EditVerifyCodeView
  extends RelativeLayout
{
  private ImageView[] iTP;
  private TextView[] iTQ;
  View.OnKeyListener iTR;
  private EditText jZ;
  public StringBuilder mBuilder;
  private Context mContext;
  
  public EditVerifyCodeView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(15417590415360L, 114870);
    this.mBuilder = new StringBuilder();
    this.iTP = new ImageView[6];
    this.iTQ = new TextView[6];
    this.iTR = new View.OnKeyListener()
    {
      public final boolean onKey(View paramAnonymousView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
      {
        GMTrace.i(15418664157184L, 114878);
        if ((paramAnonymousInt == 67) && (paramAnonymousKeyEvent.getAction() == 1))
        {
          EditVerifyCodeView.c(EditVerifyCodeView.this);
          GMTrace.o(15418664157184L, 114878);
          return true;
        }
        GMTrace.o(15418664157184L, 114878);
        return false;
      }
    };
    init(paramContext);
    GMTrace.o(15417590415360L, 114870);
  }
  
  public EditVerifyCodeView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(15417724633088L, 114871);
    this.mBuilder = new StringBuilder();
    this.iTP = new ImageView[6];
    this.iTQ = new TextView[6];
    this.iTR = new View.OnKeyListener()
    {
      public final boolean onKey(View paramAnonymousView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
      {
        GMTrace.i(15418664157184L, 114878);
        if ((paramAnonymousInt == 67) && (paramAnonymousKeyEvent.getAction() == 1))
        {
          EditVerifyCodeView.c(EditVerifyCodeView.this);
          GMTrace.o(15418664157184L, 114878);
          return true;
        }
        GMTrace.o(15418664157184L, 114878);
        return false;
      }
    };
    init(paramContext);
    GMTrace.o(15417724633088L, 114871);
  }
  
  private void init(Context paramContext)
  {
    GMTrace.i(15417858850816L, 114872);
    this.mContext = paramContext;
    paramContext = LayoutInflater.from(this.mContext).inflate(o.g.hDy, null);
    Object localObject1 = (TextView)paramContext.findViewById(o.f.hBz);
    Object localObject2 = (TextView)paramContext.findViewById(o.f.hBA);
    Object localObject3 = (TextView)paramContext.findViewById(o.f.hBB);
    Object localObject4 = (TextView)paramContext.findViewById(o.f.hBC);
    Object localObject5 = (TextView)paramContext.findViewById(o.f.hBD);
    Object localObject6 = (TextView)paramContext.findViewById(o.f.hBE);
    this.iTQ[0] = localObject1;
    this.iTQ[1] = localObject2;
    this.iTQ[2] = localObject3;
    this.iTQ[3] = localObject4;
    this.iTQ[4] = localObject5;
    this.iTQ[5] = localObject6;
    localObject1 = (ImageView)paramContext.findViewById(o.f.hBt);
    localObject2 = (ImageView)paramContext.findViewById(o.f.hBu);
    localObject3 = (ImageView)paramContext.findViewById(o.f.hBv);
    localObject4 = (ImageView)paramContext.findViewById(o.f.hBw);
    localObject5 = (ImageView)paramContext.findViewById(o.f.hBx);
    localObject6 = (ImageView)paramContext.findViewById(o.f.hBy);
    this.iTP[0] = localObject1;
    this.iTP[1] = localObject2;
    this.iTP[2] = localObject3;
    this.iTP[3] = localObject4;
    this.iTP[4] = localObject5;
    this.iTP[5] = localObject6;
    this.jZ = ((EditText)paramContext.findViewById(o.f.hCD));
    this.jZ.addTextChangedListener(new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        GMTrace.i(15419201028096L, 114882);
        if ((paramAnonymousEditable == null) || (paramAnonymousEditable.length() == 0))
        {
          GMTrace.o(15419201028096L, 114882);
          return;
        }
        w.i("MicroMsg.EditVerifyCodeView", "afterTextChanged:%s", new Object[] { paramAnonymousEditable.toString() });
        if (EditVerifyCodeView.a(EditVerifyCodeView.this).length() < 6)
        {
          EditVerifyCodeView.a(EditVerifyCodeView.this).append(paramAnonymousEditable.toString());
          EditVerifyCodeView.b(EditVerifyCodeView.this);
        }
        paramAnonymousEditable.delete(0, paramAnonymousEditable.length());
        GMTrace.o(15419201028096L, 114882);
      }
      
      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(15419066810368L, 114881);
        GMTrace.o(15419066810368L, 114881);
      }
      
      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(15418932592640L, 114880);
        GMTrace.o(15418932592640L, 114880);
      }
    });
    this.jZ.setKeyListener(new NumberKeyListener()
    {
      protected final char[] getAcceptedChars()
      {
        GMTrace.i(15417321979904L, 114868);
        GMTrace.o(15417321979904L, 114868);
        return new char[] { 49, 50, 51, 52, 53, 54, 55, 56, 57, 48 };
      }
      
      public final int getInputType()
      {
        GMTrace.i(15417456197632L, 114869);
        GMTrace.o(15417456197632L, 114869);
        return 3;
      }
    });
    this.jZ.setOnKeyListener(this.iTR);
    addView(paramContext, new RelativeLayout.LayoutParams(-1, -1));
    GMTrace.o(15417858850816L, 114872);
  }
  
  public final void setText(String paramString)
  {
    GMTrace.i(15417993068544L, 114873);
    this.mBuilder.delete(0, this.mBuilder.length());
    this.mBuilder.append(paramString);
    paramString = this.mBuilder.toString();
    int j = paramString.length();
    w.i("MicroMsg.EditVerifyCodeView", "mBuilder:" + this.mBuilder);
    if (j > 0)
    {
      i = 0;
      while (i < j)
      {
        this.iTQ[i].setVisibility(0);
        char c = paramString.charAt(i);
        this.iTQ[i].setText(String.valueOf(c));
        this.iTP[i].setVisibility(4);
        i += 1;
      }
      GMTrace.o(15417993068544L, 114873);
      return;
    }
    int i = 0;
    while (i < 6)
    {
      this.iTQ[i].setVisibility(4);
      this.iTQ[i].setText("");
      this.iTP[i].setVisibility(0);
      i += 1;
    }
    GMTrace.o(15417993068544L, 114873);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\sms\EditVerifyCodeView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */