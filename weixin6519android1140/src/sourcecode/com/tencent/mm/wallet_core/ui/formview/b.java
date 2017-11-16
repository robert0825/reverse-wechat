package com.tencent.mm.wallet_core.ui.formview;

import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.DatePicker;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.widget.g;
import com.tencent.mm.y.q;
import com.tenpay.android.wechat.TenpaySecureEditText;
import java.text.DecimalFormat;
import java.util.Calendar;

final class b
{
  public static int nlP;
  public static int nlQ;
  public static final int xFr;
  
  static
  {
    GMTrace.i(1499614674944L, 11173);
    nlP = 0;
    nlQ = 0;
    xFr = a.f.sJs;
    GMTrace.o(1499614674944L, 11173);
  }
  
  public static void a(MMActivity paramMMActivity, int paramInt1, int paramInt2)
  {
    GMTrace.i(1498809368576L, 11167);
    if (paramInt1 == -1)
    {
      GMTrace.o(1498809368576L, 11167);
      return;
    }
    paramMMActivity.a(com.tencent.mm.wallet_core.ui.b.a(paramMMActivity, paramInt1, paramMMActivity.getResources().getString(paramInt2), paramMMActivity.getResources().getString(a.i.tbT), new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(1484582289408L, 11061);
        paramAnonymousDialogInterface.dismiss();
        GMTrace.o(1484582289408L, 11061);
      }
    }));
    GMTrace.o(1498809368576L, 11167);
  }
  
  static void a(TenpaySecureEditText paramTenpaySecureEditText, int paramInt)
  {
    GMTrace.i(1498540933120L, 11165);
    if (paramTenpaySecureEditText != null)
    {
      if (paramInt == 1)
      {
        paramTenpaySecureEditText.setIsPasswordFormat(true);
        GMTrace.o(1498540933120L, 11165);
        return;
      }
      if (paramInt == 2)
      {
        paramTenpaySecureEditText.setIsSecurityAnswerFormat(true);
        GMTrace.o(1498540933120L, 11165);
        return;
      }
      if (paramInt == 3)
      {
        paramTenpaySecureEditText.setIsCvvPaymentFormat(true);
        GMTrace.o(1498540933120L, 11165);
        return;
      }
      if (paramInt == 4)
      {
        paramTenpaySecureEditText.setIsCvv4PaymentFormat(true);
        GMTrace.o(1498540933120L, 11165);
        return;
      }
      if (paramInt == 5)
      {
        paramTenpaySecureEditText.setIsValidThru(true);
        GMTrace.o(1498540933120L, 11165);
        return;
      }
      if (paramInt == 6)
      {
        paramTenpaySecureEditText.setIsBankcardFormat(true);
        GMTrace.o(1498540933120L, 11165);
        return;
      }
      if (paramInt == 7)
      {
        paramTenpaySecureEditText.setIsMoneyAmountFormat(true);
        GMTrace.o(1498540933120L, 11165);
        return;
      }
      paramTenpaySecureEditText.setIsCvv4PaymentFormat(false);
      GMTrace.o(1498540933120L, 11165);
      return;
    }
    w.e("MicroMsg.FormatViewUtil", "hy: param error: no edit text view");
    GMTrace.o(1498540933120L, 11165);
  }
  
  public static void f(final MMActivity paramMMActivity, WalletFormView paramWalletFormView)
  {
    GMTrace.i(1498675150848L, 11166);
    paramWalletFormView.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(1501493723136L, 11187);
        Calendar localCalendar = Calendar.getInstance();
        localCalendar.setTimeInMillis(System.currentTimeMillis());
        localCalendar.add(2, 1);
        b.nlP = localCalendar.get(1);
        b.nlQ = localCalendar.get(2);
        DatePickerDialog localDatePickerDialog = (DatePickerDialog)this.xFf.getTag(b.xFr);
        paramAnonymousView = localDatePickerDialog;
        if (localDatePickerDialog == null)
        {
          paramAnonymousView = new g(paramMMActivity, new DatePickerDialog.OnDateSetListener()
          {
            public final void onDateSet(DatePicker paramAnonymous2DatePicker, int paramAnonymous2Int1, int paramAnonymous2Int2, int paramAnonymous2Int3)
            {
              GMTrace.i(1496796102656L, 11152);
              if ((paramAnonymous2Int1 < b.nlP) && (paramAnonymous2Int2 < b.nlQ))
              {
                h.b(b.1.this.kBL, b.1.this.kBL.getString(a.i.tbA), null, true);
                if (b.1.this.xFf.xFu != null) {
                  b.1.this.xFf.xFu.gR(b.1.this.xFf.QW());
                }
                GMTrace.o(1496796102656L, 11152);
                return;
              }
              paramAnonymous2DatePicker = new DecimalFormat("00");
              if (q.zR()) {
                b.1.this.xFf.setTag(paramAnonymous2DatePicker.format(paramAnonymous2Int2 + 1) + paramAnonymous2Int1);
              }
              for (;;)
              {
                b.1.this.xFf.setText(paramAnonymous2DatePicker.format(paramAnonymous2Int2 + 1) + paramAnonymous2DatePicker.format(paramAnonymous2Int1).substring(2));
                break;
                b.1.this.xFf.setTag(paramAnonymous2DatePicker.format(paramAnonymous2Int1).substring(2) + paramAnonymous2DatePicker.format(paramAnonymous2Int2 + 1));
              }
            }
          }, b.nlP, b.nlQ, localCalendar.get(5), localCalendar.getTimeInMillis(), 2);
          this.xFf.setTag(b.xFr, paramAnonymousView);
          paramMMActivity.a(paramAnonymousView);
        }
        paramAnonymousView.show();
        GMTrace.o(1501493723136L, 11187);
      }
    });
    GMTrace.o(1498675150848L, 11166);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\wallet_core\ui\formview\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */