package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class btt
  extends com.tencent.mm.bm.a
{
  public String lQa;
  public btq vcw;
  
  public btt()
  {
    GMTrace.i(3916741738496L, 29182);
    GMTrace.o(3916741738496L, 29182);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3916875956224L, 29183);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lQa == null) {
        throw new b("Not all required fields were included: AppId");
      }
      if (this.vcw == null) {
        throw new b("Not all required fields were included: PkgConfig");
      }
      if (this.lQa != null) {
        paramVarArgs.e(1, this.lQa);
      }
      if (this.vcw != null)
      {
        paramVarArgs.fm(2, this.vcw.aYq());
        this.vcw.a(paramVarArgs);
      }
      GMTrace.o(3916875956224L, 29183);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.lQa != null) {
        paramInt = b.a.a.b.b.a.f(1, this.lQa) + 0;
      }
      i = paramInt;
      if (this.vcw != null) {
        i = paramInt + b.a.a.a.fj(2, this.vcw.aYq());
      }
      GMTrace.o(3916875956224L, 29183);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.lQa == null) {
        throw new b("Not all required fields were included: AppId");
      }
      if (this.vcw == null) {
        throw new b("Not all required fields were included: PkgConfig");
      }
      GMTrace.o(3916875956224L, 29183);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      btt localbtt = (btt)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3916875956224L, 29183);
        return -1;
      case 1: 
        localbtt.lQa = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3916875956224L, 29183);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new btq();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((btq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localbtt.vcw = ((btq)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3916875956224L, 29183);
      return 0;
    }
    GMTrace.o(3916875956224L, 29183);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\btt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */