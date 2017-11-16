package com.tencent.mm.wallet_core.ui;

import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextWatcher;
import android.text.method.NumberKeyListener;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.h;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.plugin.wxpay.a.k;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.v;
import com.tencent.mm.ui.widget.g;
import com.tencent.mm.wallet_core.a.a;
import com.tencent.mm.y.q;
import com.tenpay.android.wechat.TenpaySecureEditText;
import java.text.DecimalFormat;
import java.util.Calendar;

@Deprecated
public class EditHintView
  extends RelativeLayout
  implements View.OnFocusChangeListener
{
  private int background;
  private int gravity;
  private View.OnFocusChangeListener hvh;
  private TextView hvi;
  private ImageView hvk;
  private String hvl;
  private String hvm;
  private int hvn;
  private int hvo;
  public boolean hvp;
  private boolean hvr;
  private int hvs;
  private int hvt;
  private View.OnClickListener hvv;
  private int imeOptions;
  private int inputType;
  private int mode;
  private int nlP;
  private int nlQ;
  private boolean oep;
  public boolean wko;
  private DatePickerDialog xEA;
  private i xEB;
  private a xEC;
  private b xEs;
  private TextView xEt;
  TenpaySecureEditText xEu;
  private int xEv;
  private int xEw;
  private int xEx;
  private boolean xEy;
  private String xEz;
  
  public EditHintView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(1463778541568L, 10906);
    GMTrace.o(1463778541568L, 10906);
  }
  
  public EditHintView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(1463644323840L, 10905);
    this.hvl = "";
    this.hvm = "";
    this.inputType = 1;
    this.oep = true;
    this.hvt = -1;
    this.hvs = 1;
    this.gravity = 19;
    this.xEv = -1;
    this.hvn = -1;
    this.hvr = false;
    this.xEw = 1;
    this.xEx = -1;
    this.background = -1;
    this.hvo = -1;
    this.hvp = true;
    this.wko = true;
    this.xEy = true;
    this.xEz = null;
    this.mode = 0;
    this.xEA = null;
    this.nlP = 0;
    this.nlQ = 0;
    this.hvv = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(1462973235200L, 10900);
        if (EditHintView.l(EditHintView.this).getVisibility() == 0)
        {
          if ((EditHintView.this.hvp) && (!bg.nm(EditHintView.this.getText())))
          {
            EditHintView.this.xEu.ClearInput();
            GMTrace.o(1462973235200L, 10900);
            return;
          }
          if (EditHintView.f(EditHintView.this) == 1)
          {
            if ((EditHintView.m(EditHintView.this) != null) && (EditHintView.n(EditHintView.this))) {
              GMTrace.o(1462973235200L, 10900);
            }
          }
          else {
            EditHintView.o(EditHintView.this);
          }
        }
        GMTrace.o(1462973235200L, 10900);
      }
    };
    this.xEB = null;
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, a.k.tip, paramInt, 0);
    paramInt = paramAttributeSet.getResourceId(a.k.tiy, 0);
    if (paramInt != 0) {
      this.hvl = paramContext.getString(paramInt);
    }
    paramInt = paramAttributeSet.getResourceId(a.k.tiD, 0);
    if (paramInt != 0) {
      this.hvm = paramContext.getString(paramInt);
    }
    this.inputType = paramAttributeSet.getInteger(a.k.tiu, 1);
    this.hvp = paramAttributeSet.getBoolean(a.k.tix, true);
    this.gravity = paramAttributeSet.getInt(a.k.tis, 19);
    this.oep = paramAttributeSet.getBoolean(a.k.tir, true);
    this.hvt = paramAttributeSet.getInteger(a.k.tiB, -1);
    this.hvn = paramAttributeSet.getInteger(a.k.tiw, 0);
    this.imeOptions = paramAttributeSet.getInteger(a.k.tit, 5);
    this.xEx = paramAttributeSet.getColor(a.k.tiA, a.c.black);
    this.background = paramAttributeSet.getResourceId(a.k.tiq, -1);
    this.hvo = paramAttributeSet.getResourceId(a.k.tiz, a.e.snS);
    this.hvs = paramAttributeSet.getInteger(a.k.tiC, 1);
    this.wko = paramAttributeSet.getBoolean(a.k.tiv, true);
    paramAttributeSet.recycle();
    paramContext = v.fb(paramContext).inflate(a.g.sMq, this, true);
    this.xEu = ((TenpaySecureEditText)paramContext.findViewById(a.f.bGe));
    this.hvi = ((TextView)paramContext.findViewById(a.f.chy));
    this.xEt = ((TextView)paramContext.findViewById(a.f.sEw));
    this.hvk = ((ImageView)paramContext.findViewById(a.f.bHp));
    this.xEu.setImeOptions(this.imeOptions);
    switch (this.hvn)
    {
    case 11: 
    default: 
      this.inputType = 1;
    case 0: 
      cmh();
      this.xEu.setSingleLine(this.wko);
      if (!this.wko) {
        this.xEu.setMaxLines(1073741823);
      }
      this.hvk.setOnClickListener(this.hvv);
      this.xEu.addTextChangedListener(new TextWatcher()
      {
        public final void afterTextChanged(Editable paramAnonymousEditable)
        {
          GMTrace.i(1463510106112L, 10904);
          boolean bool = EditHintView.this.QW();
          if ((bool != EditHintView.c(EditHintView.this)) && (EditHintView.d(EditHintView.this) != null))
          {
            w.d("MicroMsg.EditHintView", "View:" + EditHintView.e(EditHintView.this) + ", editType:" + EditHintView.f(EditHintView.this) + " inputValid change to " + bool);
            EditHintView.a(EditHintView.this, bool);
          }
          EditHintView.g(EditHintView.this);
          GMTrace.o(1463510106112L, 10904);
        }
        
        public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(1463375888384L, 10903);
          if ((EditHintView.a(EditHintView.this) == 4) && (EditHintView.this.QW()))
          {
            EditHintView.b(EditHintView.this);
            EditHintView.this.xEu.ClearInput();
          }
          GMTrace.o(1463375888384L, 10903);
        }
        
        public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(1463241670656L, 10902);
          GMTrace.o(1463241670656L, 10902);
        }
      });
      this.xEu.setOnFocusChangeListener(this);
      if (!bg.nm(this.hvl)) {
        this.xEu.setHint(this.hvl);
      }
      if (!bg.nm(this.hvm)) {
        this.hvi.setText(this.hvm);
      }
      this.xEu.setGravity(this.gravity);
      if (this.inputType == 2)
      {
        this.xEu.setKeyListener(new NumberKeyListener()
        {
          protected final char[] getAcceptedChars()
          {
            GMTrace.i(1469281468416L, 10947);
            GMTrace.o(1469281468416L, 10947);
            return new char[] { 49, 50, 51, 52, 53, 54, 55, 56, 57, 48 };
          }
          
          public final int getInputType()
          {
            GMTrace.i(1469147250688L, 10946);
            GMTrace.o(1469147250688L, 10946);
            return 3;
          }
        });
        label671:
        if (this.hvt != -1) {
          this.xEu.setFilters(new InputFilter[] { new InputFilter.LengthFilter(this.hvt) });
        }
        super.setEnabled(true);
        super.setClickable(true);
        if (!this.oep)
        {
          this.xEu.setEnabled(false);
          this.xEu.setTextColor(getResources().getColor(this.xEx));
          this.xEu.setFocusable(false);
          this.xEu.setClickable(false);
          this.xEu.setBackgroundResource(a.e.bbj);
          setBackgroundResource(a.e.aXC);
        }
        if (this.hvp) {
          break label1429;
        }
        this.hvr = true;
        this.xEu.setEnabled(false);
        this.xEu.setTextColor(getResources().getColor(a.c.aOn));
        this.xEu.setFocusable(false);
        this.xEu.setClickable(false);
        this.xEu.setBackgroundResource(a.e.bbj);
        setBackgroundResource(a.e.aVO);
        label850:
        if (this.background > 0) {
          setBackgroundResource(this.background);
        }
        if ((this.hvi != null) && (this.xEv != -1))
        {
          paramContext = this.hvi.getLayoutParams();
          paramContext.width = this.xEv;
          this.hvi.setLayoutParams(paramContext);
        }
        if (q.zR())
        {
          paramContext = this.xEu;
          switch (this.hvn)
          {
          case 2: 
          case 3: 
          case 5: 
          case 8: 
          case 9: 
          case 10: 
          case 11: 
          case 12: 
          default: 
            paramInt = 0;
          }
        }
      }
      break;
    }
    for (;;)
    {
      paramContext.setSecureEncrypt(new a(paramInt));
      GMTrace.o(1463644323840L, 10905);
      return;
      this.hvt = 25;
      this.xEu.setIsBankcardFormat(true);
      this.inputType = 2;
      break;
      this.hvt = 6;
      this.hvi.setVisibility(8);
      this.xEu.setIsPasswordFormat(true);
      this.xEu.setImeOptions(6);
      this.inputType = 128;
      break;
      this.hvt = 3;
      this.hvi.setVisibility(8);
      this.xEu.setIsCvvPaymentFormat(true);
      this.xEu.setImeOptions(6);
      this.inputType = 128;
      break;
      this.hvt = 4;
      this.hvi.setVisibility(8);
      this.xEu.setIsCvv4PaymentFormat(true);
      this.xEu.setImeOptions(6);
      this.inputType = 128;
      break;
      this.hvt = 30;
      this.inputType = 3;
      break;
      this.hvt = 18;
      this.inputType = 4;
      break;
      this.hvt = 4;
      this.inputType = 2;
      break;
      this.hvp = false;
      this.xEu.setIsValidThru(true);
      setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(1468878815232L, 10944);
          if (EditHintView.h(EditHintView.this) == null)
          {
            paramAnonymousView = Calendar.getInstance();
            paramAnonymousView.setTimeInMillis(System.currentTimeMillis());
            paramAnonymousView.add(2, 1);
            EditHintView.a(EditHintView.this, paramAnonymousView.get(1));
            EditHintView.b(EditHintView.this, paramAnonymousView.get(2));
            EditHintView.a(EditHintView.this, new g(EditHintView.this.getContext(), new DatePickerDialog.OnDateSetListener()
            {
              public final void onDateSet(DatePicker paramAnonymous2DatePicker, int paramAnonymous2Int1, int paramAnonymous2Int2, int paramAnonymous2Int3)
              {
                GMTrace.i(1470086774784L, 10953);
                if ((paramAnonymous2Int1 < EditHintView.i(EditHintView.this)) && (paramAnonymous2Int2 < EditHintView.j(EditHintView.this)))
                {
                  h.b(EditHintView.this.getContext(), EditHintView.this.getContext().getString(a.i.tbA), null, true);
                  EditHintView.a(EditHintView.this, EditHintView.this.QW());
                  if (EditHintView.d(EditHintView.this) != null) {
                    w.d("MicroMsg.EditHintView", "View:" + EditHintView.e(EditHintView.this) + ", editType:" + EditHintView.f(EditHintView.this) + " inputValid change to " + EditHintView.c(EditHintView.this));
                  }
                  GMTrace.o(1470086774784L, 10953);
                  return;
                }
                paramAnonymous2DatePicker = new DecimalFormat("00");
                if (q.zR()) {
                  EditHintView.a(EditHintView.this, paramAnonymous2DatePicker.format(paramAnonymous2Int2 + 1) + paramAnonymous2Int1);
                }
                for (;;)
                {
                  EditHintView.k(EditHintView.this).setText(paramAnonymous2DatePicker.format(paramAnonymous2Int2 + 1) + paramAnonymous2DatePicker.format(paramAnonymous2Int1).substring(2));
                  break;
                  EditHintView.a(EditHintView.this, paramAnonymous2DatePicker.format(paramAnonymous2Int1).substring(2) + paramAnonymous2DatePicker.format(paramAnonymous2Int2 + 1));
                }
              }
            }, EditHintView.i(EditHintView.this), EditHintView.j(EditHintView.this), paramAnonymousView.get(5), paramAnonymousView.getTimeInMillis()));
          }
          EditHintView.h(EditHintView.this).show();
          GMTrace.o(1468878815232L, 10944);
        }
      });
      break;
      this.hvt = 6;
      this.hvi.setVisibility(8);
      this.inputType = 2;
      break;
      this.inputType = 32;
      break;
      if ((this.hvp) || (!this.oep)) {
        break;
      }
      break;
      this.hvt = 12;
      this.xEu.setIsMoneyAmountFormat(true);
      break;
      this.xEu.setIsSecurityAnswerFormat(true);
      break;
      if (this.inputType == 4)
      {
        this.xEu.setKeyListener(new NumberKeyListener()
        {
          protected final char[] getAcceptedChars()
          {
            GMTrace.i(1506728214528L, 11226);
            GMTrace.o(1506728214528L, 11226);
            return new char[] { 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 120, 88 };
          }
          
          public final int getInputType()
          {
            GMTrace.i(1506593996800L, 11225);
            GMTrace.o(1506593996800L, 11225);
            return 1;
          }
        });
        break label671;
      }
      if (this.inputType == 128)
      {
        this.xEu.setTransformationMethod(PasswordTransformationMethod.getInstance());
        this.xEu.setKeyListener(new NumberKeyListener()
        {
          protected final char[] getAcceptedChars()
          {
            GMTrace.i(1478945144832L, 11019);
            GMTrace.o(1478945144832L, 11019);
            return new char[] { 49, 50, 51, 52, 53, 54, 55, 56, 57, 48 };
          }
          
          public final int getInputType()
          {
            GMTrace.i(1478810927104L, 11018);
            GMTrace.o(1478810927104L, 11018);
            return 18;
          }
        });
        this.xEu.setRawInputType(18);
        break label671;
      }
      if (this.inputType == 3)
      {
        this.xEu.setKeyListener(new NumberKeyListener()
        {
          protected final char[] getAcceptedChars()
          {
            GMTrace.i(1470892081152L, 10959);
            GMTrace.o(1470892081152L, 10959);
            return new char[] { 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 45 };
          }
          
          public final int getInputType()
          {
            GMTrace.i(1470757863424L, 10958);
            GMTrace.o(1470757863424L, 10958);
            return 3;
          }
        });
        break label671;
      }
      this.xEu.setInputType(this.inputType);
      break label671;
      label1429:
      this.hvr = false;
      this.xEu.setBackgroundResource(this.hvo);
      setBackgroundResource(a.e.bbj);
      break label850;
      paramInt = -10;
      continue;
      paramInt = 20;
      continue;
      paramInt = 60;
      continue;
      paramInt = 40;
      continue;
      paramInt = -20;
      continue;
      paramInt = 30;
      continue;
      paramInt = 50;
    }
  }
  
  private void cmh()
  {
    GMTrace.i(1464986501120L, 10915);
    if ((this.hvn == 7) || (this.hvn == 14) || (this.hvn == 15))
    {
      GMTrace.o(1464986501120L, 10915);
      return;
    }
    if ((this.hvp) && (!bg.nm(getText())))
    {
      this.hvk.setVisibility(0);
      this.hvk.setImageResource(a.e.aXB);
      GMTrace.o(1464986501120L, 10915);
      return;
    }
    switch (this.hvn)
    {
    case 2: 
    case 5: 
    case 6: 
    case 7: 
    case 8: 
    default: 
      this.hvk.setVisibility(8);
      GMTrace.o(1464986501120L, 10915);
      return;
    case 3: 
    case 4: 
    case 9: 
    case 10: 
      this.hvk.setVisibility(0);
      this.hvk.setImageResource(a.e.soJ);
      GMTrace.o(1464986501120L, 10915);
      return;
    }
    if (this.xEy)
    {
      this.hvk.setVisibility(0);
      this.hvk.setImageResource(a.h.sQZ);
      GMTrace.o(1464986501120L, 10915);
      return;
    }
    this.hvk.setVisibility(8);
    GMTrace.o(1464986501120L, 10915);
  }
  
  public final boolean QW()
  {
    GMTrace.i(1464181194752L, 10909);
    if ((!this.hvp) && (!this.oep))
    {
      GMTrace.o(1464181194752L, 10909);
      return true;
    }
    boolean bool;
    switch (this.hvn)
    {
    case 0: 
    case 2: 
    case 3: 
    case 6: 
    case 10: 
    case 11: 
    case 13: 
    case 16: 
    default: 
      if (this.xEu.getInputLength() >= this.hvs)
      {
        GMTrace.o(1464181194752L, 10909);
        return true;
      }
      break;
    case 1: 
      bool = this.xEu.isBankcardNum();
      GMTrace.o(1464181194752L, 10909);
      return bool;
    case 9: 
      bool = this.xEu.isPhoneNum();
      GMTrace.o(1464181194752L, 10909);
      return bool;
    case 4: 
      if (this.xEu.getInputLength() > 0)
      {
        GMTrace.o(1464181194752L, 10909);
        return true;
      }
      GMTrace.o(1464181194752L, 10909);
      return false;
    case 5: 
      bool = this.xEu.isAreaIDCardNum(this.xEw);
      GMTrace.o(1464181194752L, 10909);
      return bool;
    case 7: 
    case 17: 
      if (this.xEu.getInputLength() == 6)
      {
        GMTrace.o(1464181194752L, 10909);
        return true;
      }
      GMTrace.o(1464181194752L, 10909);
      return false;
    case 14: 
      if (this.xEu.getInputLength() == 3)
      {
        GMTrace.o(1464181194752L, 10909);
        return true;
      }
      GMTrace.o(1464181194752L, 10909);
      return false;
    case 15: 
      if (this.xEu.getInputLength() == 4)
      {
        GMTrace.o(1464181194752L, 10909);
        return true;
      }
      GMTrace.o(1464181194752L, 10909);
      return false;
    case 8: 
      bool = bg.Sj(this.xEu.getText().toString());
      GMTrace.o(1464181194752L, 10909);
      return bool;
    case 12: 
      bool = this.xEu.isMoneyAmount();
      GMTrace.o(1464181194752L, 10909);
      return bool;
    }
    GMTrace.o(1464181194752L, 10909);
    return false;
  }
  
  public final String getText()
  {
    GMTrace.i(1464046977024L, 10908);
    switch (this.hvn)
    {
    case 11: 
    case 12: 
    default: 
      str = bg.aq(this.xEu.getText().toString(), "");
      GMTrace.o(1464046977024L, 10908);
      return str;
    case 1: 
    case 13: 
    case 16: 
      str = this.xEu.getEncryptDataWithHash(false);
      GMTrace.o(1464046977024L, 10908);
      return str;
    case 4: 
    case 14: 
    case 15: 
      str = this.xEu.get3DesEncrptData();
      GMTrace.o(1464046977024L, 10908);
      return str;
    case 5: 
      str = this.xEu.get3DesEncrptData();
      GMTrace.o(1464046977024L, 10908);
      return str;
    case 3: 
      str = bg.aq(this.xEz, "").replace("/", "");
      GMTrace.o(1464046977024L, 10908);
      return str;
    case 2: 
    case 9: 
      str = bg.aq(this.xEu.getText().toString(), "");
      GMTrace.o(1464046977024L, 10908);
      return str;
    case 0: 
    case 8: 
    case 10: 
      str = bg.aq(this.xEu.getText().toString(), "");
      GMTrace.o(1464046977024L, 10908);
      return str;
    case 6: 
      str = this.xEu.get3DesVerifyCode();
      GMTrace.o(1464046977024L, 10908);
      return str;
    }
    String str = this.xEu.getEncryptDataWithHash(true);
    GMTrace.o(1464046977024L, 10908);
    return str;
  }
  
  public void onFocusChange(View paramView, boolean paramBoolean)
  {
    GMTrace.i(1465120718848L, 10916);
    if (this.hvh != null) {
      this.hvh.onFocusChange(this, paramBoolean);
    }
    w.d("MicroMsg.EditHintView", "View:" + this.hvm + ", editType:" + this.hvn + " onFocusChange to " + paramBoolean);
    if (!this.hvr)
    {
      this.hvi.setEnabled(false);
      GMTrace.o(1465120718848L, 10916);
      return;
    }
    this.hvi.setEnabled(true);
    GMTrace.o(1465120718848L, 10916);
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(1464583847936L, 10912);
    int i;
    if (!this.hvp)
    {
      if (this.hvk.getVisibility() != 0) {
        break label126;
      }
      i = 1;
      if (i == 0) {
        break label136;
      }
      Rect localRect = new Rect();
      this.hvk.getHitRect(localRect);
      localRect.left -= 50;
      localRect.right += 50;
      localRect.top -= 25;
      localRect.bottom += 25;
      if (!localRect.contains((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY())) {
        break label131;
      }
      i = 1;
    }
    for (;;)
    {
      if (i == 0) {
        break label141;
      }
      GMTrace.o(1464583847936L, 10912);
      return false;
      label126:
      i = 0;
      break;
      label131:
      i = 0;
      continue;
      label136:
      i = 0;
    }
    label141:
    GMTrace.o(1464583847936L, 10912);
    return true;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(1463912759296L, 10907);
    int j;
    int i;
    if ((this.hvn != 7) && (this.hvn != 17) && (this.hvn != 14))
    {
      j = paramInt1;
      i = paramInt2;
      if (this.hvn != 15) {}
    }
    else
    {
      setMeasuredDimension(getDefaultSize(BackwardSupportUtil.b.a(getContext(), 960.0F), paramInt1), getDefaultSize(BackwardSupportUtil.b.a(getContext(), 720.0F), paramInt2));
      paramInt2 = getMeasuredWidth();
      if ((this.hvn != 7) && (this.hvn != 17)) {
        break label159;
      }
      paramInt1 = paramInt2 / 6;
    }
    for (;;)
    {
      j = View.MeasureSpec.makeMeasureSpec(paramInt2, 1073741824);
      i = View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824);
      setMeasuredDimension(getDefaultSize(paramInt2, j), getDefaultSize(paramInt1, i));
      super.onMeasure(j, i);
      GMTrace.o(1463912759296L, 10907);
      return;
      label159:
      if (this.hvn == 14) {
        paramInt1 = paramInt2 / 3;
      } else {
        paramInt1 = paramInt2 / 4;
      }
    }
  }
  
  public void setClickable(boolean paramBoolean)
  {
    GMTrace.i(1464449630208L, 10911);
    super.setClickable(paramBoolean);
    this.oep = paramBoolean;
    if (!paramBoolean)
    {
      this.xEu.setEnabled(false);
      if (!this.hvp) {
        this.xEu.setTextColor(getResources().getColor(a.c.aOl));
      }
      for (;;)
      {
        this.xEu.setFocusable(false);
        this.xEu.setClickable(false);
        GMTrace.o(1464449630208L, 10911);
        return;
        this.xEu.setTextColor(getResources().getColor(this.xEx));
      }
    }
    this.xEu.setEnabled(true);
    if (!this.hvp) {
      this.xEu.setTextColor(getResources().getColor(a.c.aOn));
    }
    for (;;)
    {
      this.xEu.setFocusable(true);
      this.xEu.setClickable(true);
      GMTrace.o(1464449630208L, 10911);
      return;
      this.xEu.setTextColor(getResources().getColor(this.xEx));
    }
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    GMTrace.i(1464315412480L, 10910);
    super.setEnabled(paramBoolean);
    this.hvp = paramBoolean;
    this.hvk.setEnabled(true);
    GMTrace.o(1464315412480L, 10910);
  }
  
  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    GMTrace.i(1464718065664L, 10913);
    super.setOnClickListener(paramOnClickListener);
    GMTrace.o(1464718065664L, 10913);
  }
  
  public void setOnFocusChangeListener(View.OnFocusChangeListener paramOnFocusChangeListener)
  {
    GMTrace.i(1464852283392L, 10914);
    super.setOnFocusChangeListener(paramOnFocusChangeListener);
    this.hvh = paramOnFocusChangeListener;
    GMTrace.o(1464852283392L, 10914);
  }
  
  public static abstract interface a {}
  
  public static abstract interface b {}
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\wallet_core\ui\EditHintView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */