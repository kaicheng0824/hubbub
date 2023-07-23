// Generated by view binder compiler. Do not edit!
package com.example.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.app.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class PostItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView postImageView;

  @NonNull
  public final TextView postNameTextView;

  private PostItemBinding(@NonNull LinearLayout rootView, @NonNull ImageView postImageView,
      @NonNull TextView postNameTextView) {
    this.rootView = rootView;
    this.postImageView = postImageView;
    this.postNameTextView = postNameTextView;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static PostItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PostItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.post_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PostItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.postImageView;
      ImageView postImageView = ViewBindings.findChildViewById(rootView, id);
      if (postImageView == null) {
        break missingId;
      }

      id = R.id.postNameTextView;
      TextView postNameTextView = ViewBindings.findChildViewById(rootView, id);
      if (postNameTextView == null) {
        break missingId;
      }

      return new PostItemBinding((LinearLayout) rootView, postImageView, postNameTextView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}