package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bkp
  extends ayx
{
  public String devicetype;
  public String fsF;
  public String nAQ;
  public int uVi;
  
  public bkp()
  {
    GMTrace.i(3716086235136L, 27687);
    GMTrace.o(3716086235136L, 27687);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3716220452864L, 27688);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.devicetype == null) {
        throw new b("Not all required fields were included: devicetype");
      }
      if (this.nAQ == null) {
        throw new b("Not all required fields were included: deviceid");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.devicetype != null) {
        paramVarArgs.e(2, this.devicetype);
      }
      if (this.nAQ != null) {
        paramVarArgs.e(3, this.nAQ);
      }
      if (this.fsF != null) {
        paramVarArgs.e(4, this.fsF);
      }
      paramVarArgs.fk(5, this.uVi);
      GMTrace.o(3716220452864L, 27688);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uNh != null) {
        i = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      paramInt = i;
      if (this.devicetype != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.devicetype);
      }
      i = paramInt;
      if (this.nAQ != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.nAQ);
      }
      paramInt = i;
      if (this.fsF != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.fsF);
      }
      i = b.a.a.a.fh(5, this.uVi);
      GMTrace.o(3716220452864L, 27688);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.devicetype == null) {
        throw new b("Not all required fields were included: devicetype");
      }
      if (this.nAQ == null) {
        throw new b("Not all required fields were included: deviceid");
      }
      GMTrace.o(3716220452864L, 27688);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bkp localbkp = (bkp)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3716220452864L, 27688);
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
          localbkp.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3716220452864L, 27688);
        return 0;
      case 2: 
        localbkp.devicetype = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3716220452864L, 27688);
        return 0;
      case 3: 
        localbkp.nAQ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3716220452864L, 27688);
        return 0;
      case 4: 
        localbkp.fsF = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3716220452864L, 27688);
        return 0;
      }
      localbkp.uVi = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3716220452864L, 27688);
      return 0;
    }
    GMTrace.o(3716220452864L, 27688);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bkp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */