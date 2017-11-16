package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class tc
  extends ayx
{
  public int tMX;
  public float tYy;
  public float tYz;
  public String ugx;
  public String uja;
  public int ujb;
  public String ujc;
  public String ujd;
  public int uje;
  
  public tc()
  {
    GMTrace.i(3841982464000L, 28625);
    GMTrace.o(3841982464000L, 28625);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3842116681728L, 28626);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.tMX);
      if (this.uja != null) {
        paramVarArgs.e(3, this.uja);
      }
      paramVarArgs.n(4, this.tYy);
      paramVarArgs.n(5, this.tYz);
      paramVarArgs.fk(6, this.ujb);
      if (this.ujc != null) {
        paramVarArgs.e(7, this.ujc);
      }
      if (this.ujd != null) {
        paramVarArgs.e(8, this.ujd);
      }
      paramVarArgs.fk(9, this.uje);
      if (this.ugx != null) {
        paramVarArgs.e(10, this.ugx);
      }
      GMTrace.o(3842116681728L, 28626);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.tMX);
      paramInt = i;
      if (this.uja != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.uja);
      }
      i = paramInt + (b.a.a.b.b.a.cK(4) + 4) + (b.a.a.b.b.a.cK(5) + 4) + b.a.a.a.fh(6, this.ujb);
      paramInt = i;
      if (this.ujc != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.ujc);
      }
      i = paramInt;
      if (this.ujd != null) {
        i = paramInt + b.a.a.b.b.a.f(8, this.ujd);
      }
      i += b.a.a.a.fh(9, this.uje);
      paramInt = i;
      if (this.ugx != null) {
        paramInt = i + b.a.a.b.b.a.f(10, this.ugx);
      }
      GMTrace.o(3842116681728L, 28626);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3842116681728L, 28626);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      tc localtc = (tc)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3842116681728L, 28626);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localtc.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3842116681728L, 28626);
        return 0;
      case 2: 
        localtc.tMX = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3842116681728L, 28626);
        return 0;
      case 3: 
        localtc.uja = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3842116681728L, 28626);
        return 0;
      case 4: 
        localtc.tYy = ((b.a.a.a.a)localObject1).yqV.readFloat();
        GMTrace.o(3842116681728L, 28626);
        return 0;
      case 5: 
        localtc.tYz = ((b.a.a.a.a)localObject1).yqV.readFloat();
        GMTrace.o(3842116681728L, 28626);
        return 0;
      case 6: 
        localtc.ujb = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3842116681728L, 28626);
        return 0;
      case 7: 
        localtc.ujc = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3842116681728L, 28626);
        return 0;
      case 8: 
        localtc.ujd = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3842116681728L, 28626);
        return 0;
      case 9: 
        localtc.uje = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3842116681728L, 28626);
        return 0;
      }
      localtc.ugx = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3842116681728L, 28626);
      return 0;
    }
    GMTrace.o(3842116681728L, 28626);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\tc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */