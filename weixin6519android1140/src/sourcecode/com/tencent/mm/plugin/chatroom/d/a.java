package com.tencent.mm.plugin.chatroom.d;

import com.tencent.gmtrace.GMTrace;
import java.util.Calendar;

public final class a
{
  private Calendar calendar;
  public long eDr;
  public long jMX;
  public int jqS;
  public int month;
  public int year;
  
  public a()
  {
    GMTrace.i(9063186300928L, 67526);
    setTime(System.currentTimeMillis());
    GMTrace.o(9063186300928L, 67526);
  }
  
  public a(int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(9063320518656L, 67527);
    this.year = paramInt1;
    this.month = paramInt2;
    this.jqS = paramInt3;
    GMTrace.o(9063320518656L, 67527);
  }
  
  public a(long paramLong)
  {
    GMTrace.i(9063454736384L, 67528);
    this.jMX = paramLong;
    setTime(paramLong);
    GMTrace.o(9063454736384L, 67528);
  }
  
  private void setTime(long paramLong)
  {
    GMTrace.i(9063588954112L, 67529);
    this.jMX = paramLong;
    if (this.calendar == null) {
      this.calendar = Calendar.getInstance();
    }
    this.calendar.setTimeInMillis(paramLong);
    this.month = this.calendar.get(2);
    this.year = this.calendar.get(1);
    this.jqS = this.calendar.get(5);
    GMTrace.o(9063588954112L, 67529);
  }
  
  public final boolean equals(Object paramObject)
  {
    GMTrace.i(9063857389568L, 67531);
    if ((paramObject instanceof a))
    {
      paramObject = (a)paramObject;
      if ((((a)paramObject).jqS == this.jqS) && (((a)paramObject).month == this.month) && (((a)paramObject).year == this.year))
      {
        GMTrace.o(9063857389568L, 67531);
        return true;
      }
      GMTrace.o(9063857389568L, 67531);
      return false;
    }
    GMTrace.o(9063857389568L, 67531);
    return false;
  }
  
  public final String toString()
  {
    GMTrace.i(9063723171840L, 67530);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("{ year: ");
    ((StringBuilder)localObject).append(this.year);
    ((StringBuilder)localObject).append(", month: ");
    ((StringBuilder)localObject).append(this.month);
    ((StringBuilder)localObject).append(", day: ");
    ((StringBuilder)localObject).append(this.jqS);
    ((StringBuilder)localObject).append(" }");
    localObject = ((StringBuilder)localObject).toString();
    GMTrace.o(9063723171840L, 67530);
    return (String)localObject;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\chatroom\d\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */