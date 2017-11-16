package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class alr
  extends ayx
{
  public String gOY;
  public int tMX;
  public float tYy;
  public float tYz;
  public int uAM;
  public int uAN;
  public int ujb;
  public String ujc;
  public String ujd;
  public int uje;
  
  public alr()
  {
    GMTrace.i(3922110447616L, 29222);
    GMTrace.o(3922110447616L, 29222);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3922244665344L, 29223);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.tMX);
      paramVarArgs.n(3, this.tYy);
      paramVarArgs.n(4, this.tYz);
      paramVarArgs.fk(5, this.ujb);
      if (this.ujc != null) {
        paramVarArgs.e(6, this.ujc);
      }
      if (this.ujd != null) {
        paramVarArgs.e(7, this.ujd);
      }
      paramVarArgs.fk(8, this.uje);
      if (this.gOY != null) {
        paramVarArgs.e(9, this.gOY);
      }
      paramVarArgs.fk(10, this.uAM);
      paramVarArgs.fk(11, this.uAN);
      GMTrace.o(3922244665344L, 29223);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.tMX) + (b.a.a.b.b.a.cK(3) + 4) + (b.a.a.b.b.a.cK(4) + 4) + b.a.a.a.fh(5, this.ujb);
      paramInt = i;
      if (this.ujc != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.ujc);
      }
      i = paramInt;
      if (this.ujd != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.ujd);
      }
      i += b.a.a.a.fh(8, this.uje);
      paramInt = i;
      if (this.gOY != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.gOY);
      }
      i = b.a.a.a.fh(10, this.uAM);
      int j = b.a.a.a.fh(11, this.uAN);
      GMTrace.o(3922244665344L, 29223);
      return paramInt + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3922244665344L, 29223);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      alr localalr = (alr)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3922244665344L, 29223);
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
          localalr.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3922244665344L, 29223);
        return 0;
      case 2: 
        localalr.tMX = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3922244665344L, 29223);
        return 0;
      case 3: 
        localalr.tYy = ((b.a.a.a.a)localObject1).yqV.readFloat();
        GMTrace.o(3922244665344L, 29223);
        return 0;
      case 4: 
        localalr.tYz = ((b.a.a.a.a)localObject1).yqV.readFloat();
        GMTrace.o(3922244665344L, 29223);
        return 0;
      case 5: 
        localalr.ujb = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3922244665344L, 29223);
        return 0;
      case 6: 
        localalr.ujc = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3922244665344L, 29223);
        return 0;
      case 7: 
        localalr.ujd = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3922244665344L, 29223);
        return 0;
      case 8: 
        localalr.uje = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3922244665344L, 29223);
        return 0;
      case 9: 
        localalr.gOY = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3922244665344L, 29223);
        return 0;
      case 10: 
        localalr.uAM = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3922244665344L, 29223);
        return 0;
      }
      localalr.uAN = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3922244665344L, 29223);
      return 0;
    }
    GMTrace.o(3922244665344L, 29223);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\alr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */