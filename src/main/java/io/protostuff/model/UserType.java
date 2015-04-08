package io.protostuff.model;

/**
 * @author Kostiantyn Shchepanovskyi
 */
public interface UserType {

    /**
     * Short name. For example, {@code Baz}
     */
    String getName();

    void setName(String name);

    Proto getProto();

    void setProto(Proto proto);

    String getFullName();

    void setFullName(String fullName);


//    @Nullable
//    Message getParentMessage();

    /**
     * Fully qualified name of a message/enum. Includes package, all parent messages chain and
     * this message name. For example, {@code foo.bar.Message1.Baz}
     */
//    String getFullName();
}