package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class acv
  extends azh
{
  public int lQF;
  public avr usO;
  public avp usP;
  
  public acv()
  {
    GMTrace.i(3643474444288L, 27146);
    GMTrace.o(3643474444288L, 27146);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3643608662016L, 27147);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.usO == null) {
        throw new b("Not all required fields were included: QQGroup");
      }
      if (this.usP == null) {
        throw new b("Not all required fields were included: QQFriend");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.lQF);
      if (this.usO != null)
      {
        paramVarArgs.fm(3, this.usO.aYq());
        this.usO.a(paramVarArgs);
      }
      if (this.usP != null)
      {
        paramVarArgs.fm(4, this.usP.aYq());
        this.usP.a(paramVarArgs);
      }
      GMTrace.o(3643608662016L, 27147);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.lQF);
      paramInt = i;
      if (this.usO != null) {
        paramInt = i + b.a.a.a.fj(3, this.usO.aYq());
      }
      i = paramInt;
      if (this.usP != null) {
        i = paramInt + b.a.a.a.fj(4, this.usP.aYq());
      }
      GMTrace.o(3643608662016L, 27147);
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
      if (this.usO == null) {
        throw new b("Not all required fields were included: QQGroup");
      }
      if (this.usP == null) {
        throw new b("Not all required fields were included: QQFriend");
      }
      GMTrace.o(3643608662016L, 27147);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      acv localacv = (acv)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3643608662016L, 27147);
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
          localacv.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3643608662016L, 27147);
        return 0;
      case 2: 
        localacv.lQF = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3643608662016L, 27147);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new avr();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((avr)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localacv.usO = ((avr)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3643608662016L, 27147);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new avp();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((avp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
        localacv.usP = ((avp)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3643608662016L, 27147);
      return 0;
    }
    GMTrace.o(3643608662016L, 27147);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\acv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */