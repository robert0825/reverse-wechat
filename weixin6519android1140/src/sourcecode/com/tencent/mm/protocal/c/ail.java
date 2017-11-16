package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ail
  extends azh
{
  public String tVU;
  public awq tWa;
  public String ufc;
  public String ufd;
  public int ufe;
  public us uff;
  public hf ufg;
  
  public ail()
  {
    GMTrace.i(3937142833152L, 29334);
    GMTrace.o(3937142833152L, 29334);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3937277050880L, 29335);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.tWa == null) {
        throw new b("Not all required fields were included: qy_base_resp");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      if (this.tWa != null)
      {
        paramVarArgs.fm(2, this.tWa.aYq());
        this.tWa.a(paramVarArgs);
      }
      if (this.tVU != null) {
        paramVarArgs.e(3, this.tVU);
      }
      paramVarArgs.fk(4, this.ufe);
      if (this.uff != null)
      {
        paramVarArgs.fm(5, this.uff.aYq());
        this.uff.a(paramVarArgs);
      }
      if (this.ufg != null)
      {
        paramVarArgs.fm(6, this.ufg.aYq());
        this.ufg.a(paramVarArgs);
      }
      if (this.ufc != null) {
        paramVarArgs.e(7, this.ufc);
      }
      if (this.ufd != null) {
        paramVarArgs.e(8, this.ufd);
      }
      GMTrace.o(3937277050880L, 29335);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uND != null) {
        i = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      paramInt = i;
      if (this.tWa != null) {
        paramInt = i + b.a.a.a.fj(2, this.tWa.aYq());
      }
      i = paramInt;
      if (this.tVU != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tVU);
      }
      i += b.a.a.a.fh(4, this.ufe);
      paramInt = i;
      if (this.uff != null) {
        paramInt = i + b.a.a.a.fj(5, this.uff.aYq());
      }
      i = paramInt;
      if (this.ufg != null) {
        i = paramInt + b.a.a.a.fj(6, this.ufg.aYq());
      }
      paramInt = i;
      if (this.ufc != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.ufc);
      }
      i = paramInt;
      if (this.ufd != null) {
        i = paramInt + b.a.a.b.b.a.f(8, this.ufd);
      }
      GMTrace.o(3937277050880L, 29335);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.tWa == null) {
        throw new b("Not all required fields were included: qy_base_resp");
      }
      GMTrace.o(3937277050880L, 29335);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ail localail = (ail)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3937277050880L, 29335);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new es();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((es)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localail.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3937277050880L, 29335);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new awq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((awq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localail.tWa = ((awq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3937277050880L, 29335);
        return 0;
      case 3: 
        localail.tVU = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3937277050880L, 29335);
        return 0;
      case 4: 
        localail.ufe = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3937277050880L, 29335);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new us();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((us)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localail.uff = ((us)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3937277050880L, 29335);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new hf();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((hf)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localail.ufg = ((hf)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3937277050880L, 29335);
        return 0;
      case 7: 
        localail.ufc = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3937277050880L, 29335);
        return 0;
      }
      localail.ufd = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3937277050880L, 29335);
      return 0;
    }
    GMTrace.o(3937277050880L, 29335);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\ail.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */