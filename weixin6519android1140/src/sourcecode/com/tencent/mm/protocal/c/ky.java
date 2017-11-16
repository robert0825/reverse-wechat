package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ky
  extends azh
{
  public String desc;
  public int jWs;
  public String jWt;
  public String uaY;
  public String uaZ;
  public int uba;
  public LinkedList<Integer> ubb;
  public int ube;
  
  public ky()
  {
    GMTrace.i(19148574818304L, 142668);
    this.ubb = new LinkedList();
    GMTrace.o(19148574818304L, 142668);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(19148709036032L, 142669);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.jWs);
      if (this.jWt != null) {
        paramVarArgs.e(3, this.jWt);
      }
      if (this.uaY != null) {
        paramVarArgs.e(4, this.uaY);
      }
      if (this.uaZ != null) {
        paramVarArgs.e(5, this.uaZ);
      }
      paramVarArgs.fk(6, this.uba);
      paramVarArgs.d(7, 2, this.ubb);
      if (this.desc != null) {
        paramVarArgs.e(8, this.desc);
      }
      paramVarArgs.fk(9, this.ube);
      GMTrace.o(19148709036032L, 142669);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.jWs);
      paramInt = i;
      if (this.jWt != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.jWt);
      }
      i = paramInt;
      if (this.uaY != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.uaY);
      }
      paramInt = i;
      if (this.uaZ != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.uaZ);
      }
      i = paramInt + b.a.a.a.fh(6, this.uba) + b.a.a.a.c(7, 2, this.ubb);
      paramInt = i;
      if (this.desc != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.desc);
      }
      i = b.a.a.a.fh(9, this.ube);
      GMTrace.o(19148709036032L, 142669);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.ubb.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(19148709036032L, 142669);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ky localky = (ky)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(19148709036032L, 142669);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new es();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((es)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localky.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(19148709036032L, 142669);
        return 0;
      case 2: 
        localky.jWs = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(19148709036032L, 142669);
        return 0;
      case 3: 
        localky.jWt = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19148709036032L, 142669);
        return 0;
      case 4: 
        localky.uaY = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19148709036032L, 142669);
        return 0;
      case 5: 
        localky.uaZ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19148709036032L, 142669);
        return 0;
      case 6: 
        localky.uba = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(19148709036032L, 142669);
        return 0;
      case 7: 
        localky.ubb.add(Integer.valueOf(((b.a.a.a.a)localObject1).yqV.nj()));
        GMTrace.o(19148709036032L, 142669);
        return 0;
      case 8: 
        localky.desc = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19148709036032L, 142669);
        return 0;
      }
      localky.ube = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(19148709036032L, 142669);
      return 0;
    }
    GMTrace.o(19148709036032L, 142669);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\ky.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */